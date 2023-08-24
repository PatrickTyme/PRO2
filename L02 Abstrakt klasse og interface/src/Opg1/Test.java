package Opg1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        //Mechanic
        employeeList.add(new Mechanic("Ludvig", "Göteborg Allé 15", 130, 37, 2021));
        employeeList.add(new Mechanic("Karen-Hanne", "Nejtak 28", 130, 37, 2018));
        employeeList.add(new Mechanic("John Arne", "Husvilla 82", 130, 37, 2001));
        //Foreman
        employeeList.add(new Foreman("Forsen", "Sjusk 53", 135, 37, 2012, 1000));
        employeeList.add(new Foreman("Ole Ib", "Sjask 19", 140, 37, 2020, 1000));
        //Surveyor
        employeeList.add(new Surveyor("Suresen", "Bi Allé 72", 1999, 145, 37, 21));
        //WorkingBoy
        employeeList.add(new WorkingBoy("Jens", "Newbie Lane", 88, 25));

        int totalSalary = totalWeeklySalary(employeeList);
        System.out.println("Total weekly salary for mechanics: " + totalSalary);

    }
    // Opg 4
    public static int totalWeeklySalary(ArrayList<Employee> list) {
        int totalSalary = 0;
        for (Employee employee : list) {
            totalSalary += employee.weeklySalary();
        }
        return totalSalary;
    }
}
