package Udleveret.studentapplication.gui;

import javafx.application.Application;
import Udleveret.studentapplication.controller.Controller;
import Udleveret.studentapplication.controller.Storage;
import Udleveret.studentapplication.storage.ListStorage;

public class StudentApp {

    public static void main(String[] args) {
        Storage storage = ListStorage.loadStorage();
        if (storage == null) {
            storage = new ListStorage();
            System.out.println("Empty ListStorage created");
        }
        Controller.setStorage(storage);

        if (Controller.getStudents().isEmpty()) {
            initStorage();
            System.out.println("Storage initialized");
        }

        Application.launch(StudentGui.class);

        ListStorage.saveStorage(storage);
    }

    public static void initStorage() {
        Controller.createStudent("Ib Ibsen", 20, true);
        Controller.createStudent("Jens Jens", 30, false);
    }
}