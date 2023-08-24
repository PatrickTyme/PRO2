package Opg1;

public class Foreman extends Employee {
    private int promotionYear;
    private int weeklyAddedMoney;
    public Foreman(String name, String address, int hourlyWage, int weeklyHours, int promotionYear, int weeklyAddedMoney) {
        super(name, address, hourlyWage, weeklyHours);
        this.promotionYear = promotionYear;
        this.weeklyAddedMoney = weeklyAddedMoney;
    }

    public int weeklySalary() {
        int baseSalary = super.getHourlyWage() * super.getWeeklyHours();
        return baseSalary + weeklyAddedMoney;
    }
}
