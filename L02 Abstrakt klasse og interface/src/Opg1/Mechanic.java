package Opg1;

public class Mechanic extends Employee {
    private int apprenticeYear;

    public Mechanic(String name, String address, int hourlyWage, int weeklyHours, int apprenticeYear) {
        super(name, address, hourlyWage, weeklyHours);
        this.apprenticeYear = apprenticeYear;

    }
    // Opg4 a)
    public int weeklySalary() {
        return super.getHourlyWage() * super.getWeeklyHours();
    }
}
