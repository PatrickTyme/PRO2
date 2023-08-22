package Opg3Opg4;

import java.util.ArrayList;

public class Foreman extends Mechanic {
    private String startForeman;
    private int weeklyAddedMoney;

    public String getStartForeman() {
        return startForeman;
    }

    public int getWeeklyAddedMoney() {
        return weeklyAddedMoney;
    }

    @Override
    public int getHourlyWage() {
        return super.getHourlyWage();
    }

}
