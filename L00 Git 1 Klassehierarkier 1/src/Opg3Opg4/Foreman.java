package Opg3Opg4;


public class Foreman extends Mechanic {
    private int promotionYear;
    private int weeklyAddedMoney;

    public Foreman(String name, String address, int apprenticeYear, int hourlyWage, int promotionYear, int weeklyAddedMoney) {
        super(name, address, apprenticeYear, hourlyWage);
        this.promotionYear = promotionYear;
        this.weeklyAddedMoney = weeklyAddedMoney;
    }


        public int getWeeklyAddedMoney () {
            return this.weeklyAddedMoney;
        }

        @Override
        public int getHourlyWage () {
            return super.getHourlyWage();
        }


    public int getPromotionYear() {
        return promotionYear;
    }
}
