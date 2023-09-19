package Opgaver.ex1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UseMethodsWithHashSet {
    // A) Create in main() a set that can contain integers
    public static <E> void main(String[] args) {
        // B) Add the numbers 34, 12, 23, 45, 67, 34, 98 to the set
        Set<Integer> set = new HashSet<Integer>(List.of(34, 12, 23, 45, 67, 34, 98));

        // C) Print the set
        System.out.println(set);

        // D) Add the number 23 to the set
        set.add(23);

        // E) Print the set
        System.out.println(set);

        // F) Remove the number 67 from the set.
        set.remove(67);

        // G) Print the set.
        System.out.println(set);

        // H) Check whether the set contains the number 23
        System.out.println(set.contains(23));

        //Print the count of numbers in the set.
        System.out.println(set.size());


    }

}
