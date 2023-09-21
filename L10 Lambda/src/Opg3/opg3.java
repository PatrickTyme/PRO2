package Opg3;

import java.util.*;

public class opg3 {
    public static void main(String[] args) {
        // Opg3 a: Lav en liste med 8 tal. Udskriv listen vha. en iterator.
        List<Integer> list = new ArrayList<>(List.of(1, 28, 32, 41, 83, 91, 12, 16));
        System.out.println("Opg3 a: ");
        list.forEach(integer -> System.out.println(integer));
        System.out.println();

        // Opg3 b: Lav en map med parrene (2,4), (3,9), (4, 16), (5, 25) og (6,36). Udskriv parrene vha. en iterator på keys
        Map<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(2,4);
        treeMap.put(3,9);
        treeMap.put(4,16);
        treeMap.put(5,25);
        treeMap.put(6,36);



        Iterator<Integer> iterat1 = treeMap.keySet().iterator();
        Iterator<Integer> iterat2 = treeMap.values().iterator();

        System.out.println("Opg3 b: ");
        while (iterat1.hasNext()) {
            System.out.printf("Par (%d,%d) \n", iterat1.next(), iterat2.next());
        }
        }



    }



