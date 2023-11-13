package Udleveret.architecture1stsem.storage;

import Udleveret.architecture1stsem.controller.Storage;
import Udleveret.architecture1stsem.model.Company;
import Udleveret.architecture1stsem.model.Employee;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListStorage implements Storage {
    private final List<Company> companies = new ArrayList<>();
    private final List<Employee> employees = new ArrayList<>();

    // -------------------------------------------------------------------------

    public ArrayList<Company> getCompanies() {
        return new ArrayList<>(companies);
    }

    public void storeCompany(Company company) {
        companies.add(company);
    }

    public void deleteCompany(Company company) {
        companies.remove(company);
    }

    // -------------------------------------------------------------------------

    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public void storeEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

    public static ListStorage loadStorage() {
        String fileName = "C:/Users/Patri/IdeaProjects/PRO2/L20 Arkitektur Serializable/src/Udleveret/architecture1stsem/employeefile.ser";
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objIn = new ObjectInputStream(fileIn)
        ) {
            Object obj = objIn.readObject();
            ListStorage storage = (ListStorage) obj;
            System.out.println("Storage loaded from file " + fileName);
            return storage;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error deserializing storage");
            System.out.println(ex);
            return null;
        }
    }
    public static void saveStorage(Storage storage) {
        String fileName = "C:/Users/Patri/IdeaProjects/PRO2/L20 Arkitektur Serializable/src/Udleveret/architecture1stsem/employeefile.ser";
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut)
        ) {
            objOut.writeObject(storage);
            System.out.println("Storage saved in file " + fileName);
        } catch (IOException ex) {
            System.out.println("Error serializing storage");
            System.out.println(ex);
            throw new RuntimeException();
        }
    }
}
