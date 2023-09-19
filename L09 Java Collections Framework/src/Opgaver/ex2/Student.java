package Opgaver.ex2;

import java.util.List;

public class Student {
    private int StudentNo;
    private String name;
    private List<Integer> grades;

    public Student(int studentNo, String name) {
        StudentNo = studentNo;
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return StudentNo + " " + name + " " + grades;
    }
}
