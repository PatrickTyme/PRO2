package Opg1;

public class WorkingBoy extends Employee {

    public WorkingBoy(String name, String address, int hourlyWage, int weeklyHours) {
        super(name, address, hourlyWage, weeklyHours);
    }

    public int weeklySalary() {
        int baseSalary = super.getWeeklyHours() + super.getHourlyWage();
        return baseSalary;
    }

}
