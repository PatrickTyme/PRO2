package Opg3Opg4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Mechanic> mechanicList = new ArrayList<>();
        //Mechanic
        mechanicList.add(new Mechanic("Ludvig", "Göteborg Allé 15", 2007, 125));
        mechanicList.add(new Mechanic("Karen-Hanne", "Nejtak 28", 2018, 115));
        mechanicList.add(new Mechanic("John Arne", "Husvilla 82", 2001, 128));
        //Foreman
        mechanicList.add(new Foreman("Forsen", "Sjusk 53", 1988, 130, 2012, 1000));
        mechanicList.add(new Foreman("Ole Ib", "Sjask 19", 2015, 125, 2020, 1000));
        //Surveyor
        mechanicList.add(new Surveyor("Suresen", "Bi Allé 72", 1999, 145, 30));

        int totalSalary = totalWeeklySalary(mechanicList);
        System.out.println("Total weekly salary for mechanics: " + totalSalary);


    }
    // Opg 4
    public static int totalWeeklySalary(ArrayList<Mechanic> list) {
      int totalSalary = 0;
      for (Mechanic mechanic : list) {
          totalSalary += mechanic.weeklySalary();
      }
      return totalSalary;
    }

}
