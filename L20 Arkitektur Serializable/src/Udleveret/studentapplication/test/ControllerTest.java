package Udleveret.studentapplication.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Udleveret.studentapplication.controller.Controller;
import Udleveret.studentapplication.controller.Storage;
import Udleveret.studentapplication.model.Student;
import Udleveret.studentapplication.storage.ListStorage;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {
    @BeforeEach
    public void setUp() {
        Storage storage = new ListStorage();
        Controller.setStorage(storage);
    }

    @Test
    public void testCreateStudent() {
        // act
        Student student = Controller.createStudent("Hanne", 51, true);
        // assert
        assertEquals("Hanne", student.getName());
        assertEquals(51, student.getAge());
        assertTrue(student.isActive());
        List<Student> students = Controller.getStudents();
        assertTrue(students.contains(student));
    }

    @Test
    public void testDeleteStudent() {
        // arrange
        Student student = Controller.createStudent("Hanne", 51, true);
        // act
        Controller.deleteStudent(student);
        // assert
        List<Student> students = Controller.getStudents();
        assertFalse(students.contains(student));
    }

    @Test
    public void testUpdateStudent() {
        // arrange
        Student student = Controller.createStudent("Hanne", 51, true);
        // act
        Controller.updateStudent(student, "Bente", 20, false);
        // assert
        assertEquals("Bente", student.getName());
        assertEquals(20, student.getAge());
        assertFalse(student.isActive());
    }
}
