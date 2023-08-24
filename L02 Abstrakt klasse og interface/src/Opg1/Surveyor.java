package Opg1;

public class Surveyor extends Mechanic {
    private int surveysPrWeek;

    public Surveyor(String name, String address, int apprenticeYear, int hourlyWage, int weeklyHours, int surveysPrWeek) {
        super(name, address, apprenticeYear, hourlyWage, weeklyHours);
        this.surveysPrWeek = surveysPrWeek;
    }

    @Override
    public int weeklySalary() {
        int baseSalary = super.weeklySalary();
        int surveyBonus = surveysPrWeek * 29;
        return baseSalary + surveyBonus;
    }
}
