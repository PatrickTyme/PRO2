package Opgaver.ex2;

import java.util.HashSet;

public class Opg2 {

    /* Program a generic method that takes two sets as parameters (that is, objects of type
HashSet<E>) and returns the union of the two sets as a HashSet<T>. (Do not change the
parameters.)*/
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Hanne");
        set1.add("Jens");
        set1.add("Martin");
        set1.add("Oliver");
        System.out.println(set1);

        HashSet<String> set2 = new HashSet<>();
        set2.add("Kurt");
        set2.add("Oliver");
        set2.add("Jens");
        System.out.println(set2);

        System.out.println();
        System.out.println(union(set1, set2));
        System.out.println();
        System.out.println(intersection(set1, set2));
        System.out.println();
        System.out.println(difference(set1, set2));

    }

    public static <E> HashSet<E> union(HashSet<E> set1, HashSet<E> set2) {
        HashSet<E> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }
   /* Program a similar method that returns the intersection of the two sets. And a method that
returns the difference of the two sets (denoted A \ B or A – B in math).*/

    public static <E> HashSet<E> intersection(HashSet<E> set1, HashSet<E> set2) {
        HashSet<E> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
            return intersection;
    }

    public static <E> HashSet<E> difference(HashSet<E> set1, HashSet<E> set2) {
        HashSet<E> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;


//        HashSet<E> difference = new HashSet<>(set1);
//        difference.contains(set2);
//        return difference;
    }

        /* Program a generic method that takes three sets as parameters. The method must add the first
two sets to the third set (do not change the parameters)*/

    public static <T> void union(HashSet<T> a, HashSet<T> b, HashSet<T> result){
        result.addAll(a);
        result.addAll(b);
    }
}

