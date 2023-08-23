package Opg3Opg4;

public class Mechanic extends Person {
    private int apprenticeYear;
    private int hourlyWage;

    public Mechanic(String name, String address, int apprenticeYear, int hourlyWage) {
        super(name, address);
        this.apprenticeYear = apprenticeYear;
        this.hourlyWage = hourlyWage;

    }
    // Opg4 a)
    public int weeklySalary() {
        int weeklyHours = 37;
        return hourlyWage * weeklyHours;
    }

        public int getHourlyWage() {
            return hourlyWage;
        }


    public int getApprenticeYear() {
        return apprenticeYear;
    }

}
