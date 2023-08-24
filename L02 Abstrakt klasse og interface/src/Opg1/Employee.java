package Opg1;

public abstract class Employee {
    private String name;
    private String address;
    private int hourlyWage;
    private int weeklyHours;

    public Employee(String name, String address, int hourlyWage, int weeklyHours) {
        this.name = name;
        this.address = address;
        this.hourlyWage = hourlyWage;
        this.weeklyHours = weeklyHours;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public abstract int weeklySalary();
}
