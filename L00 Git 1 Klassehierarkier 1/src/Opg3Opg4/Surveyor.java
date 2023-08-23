package Opg3Opg4;

public class Surveyor extends Mechanic {

    private int surveysPrWeek;

    public Surveyor(String name, String address, int apprenticeYear, int hourlyWage, int surveysPrWeek) {
        super(name, address, apprenticeYear, hourlyWage);
        this.surveysPrWeek = surveysPrWeek;
    }

    @Override
    public int weeklySalary() {
        int baseSalary = super.weeklySalary();
        int surveyBonus = surveysPrWeek * 29;
        return baseSalary + surveyBonus;
    }

}
