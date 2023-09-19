package Opgaver.ex2;

import java.util.ArrayList;

public class College {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void addstudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    public Student findStudent(int studentNo) {
        for (Student student : students) {
            if (student.getStudentNo() == studentNo) {
                return student;
            }
        }
        return null;
    }
    public double calcAverage() {
        double average = 0.0;
        int count = 0;
        for (Student student : students) {
            for (int s : student.getGrades()) {
                average += s;
                count++;
            }
        }
        return average / count;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
