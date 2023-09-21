package ex4student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Filter;

public class Ex4 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));
        System.out.println(runners);
        System.out.println();
        // OBS: Throws exception.
        /** Opg 4 b: Erstat den fejlende for-sætning med en løkke, som anvender en iterator til at fjerne løbere
        med lapTime >= 40. Udskriv listen med løberne */
        Iterator<Runner> i1 = runners.iterator();

        while (i1.hasNext()) {
            if (i1.next().getLapTime() >= 40) {
                i1.remove();
            }
        }
        System.out.println(runners);
        System.out.println();

        /** Lav en metode, som fjerner løbere fra en liste af løbere vha. et lambda udtryk. Metoden
        skal implementeres vha. en iterator.
        Metodens hovede*/

        /**
        * Removes runners that satisfies the given filter.
                * Returns true, if any runner is removed.
        */
        public static boolean removeIf(List<Runner> runners, Predicate<Runner> Filter) {

        }
    }
}