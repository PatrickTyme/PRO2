package ex2student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Ex2 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));

        // Opg2 a: Udskriv en linie for hver løber med name og lapTime ved at bruge List.forEach() metoden med en Consumer lambda
        System.out.println("Opg2 a: ");
        System.out.println();
        runners.forEach(runner -> System.out.println(runner.getName() + " " + runner.getLapTime()));


        // Opg2 b: Som a), men udskriv kun løberne med lapTime < 30
        System.out.println("Opg2 b: ");
        System.out.println();
        runners.forEach(runner -> {
            if (runner.getLapTime() < 30)
                System.out.println(runner.getName() + " " + runner.getLapTime());
        });

        //Opg2 c: Sorter løberne stigende efter lapTime ved at bruge List.sort() metoden med en Comparator lambda. Udskriv løberne
        Comparator<Runner> compareLapTime = (r1, r2) -> Integer.compare(r1.getLapTime(), r2.getLapTime());
        runners.sort(compareLapTime);
        System.out.println(runners);


//        System.out.println(runners);
//        System.out.println();

    }
}