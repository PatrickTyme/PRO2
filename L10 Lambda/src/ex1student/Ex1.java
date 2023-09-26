package ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 60),
                new Person("Klaus", 44),
                new Person("Birgitte", 17),
                new Person("Liselotte", 9)
        );
        // Insert code in the main method that uses the findAll() method with a lambda expression to solve question f-i


        // Opg1 a: Find the first person in the persons list with an age of 44
        System.out.println("Opg1 A: " + findFirst(persons, person -> person.getAge() == 44));

        //Opg1 b: Find the first person in the persons list with a name starting with 'S'
        System.out.println("Opg1 B: " + findFirst(persons, person -> person.getName().startsWith("S")));

        //Opg1 c: Find the first person in the persons list with a name containing more than one ’i’
        System.out.println("Opg1 C: " + findFirst(persons, person -> person.getName().matches(".*i.*i.*")));

        //Opg1 d: Find the first person in the persons list with an age equal to the length of the name.
        System.out.println("Opg1 d: " + findFirst(persons, person -> person.getAge() == person.getName().length()));

        //------------------------------------------------------------

        //Opg1 f: Find all persons with name containing the letter 'i'.
        System.out.println("Opg1 f: " + findAll(persons, person -> person.getName().contains("i")));

        //Opg1 g: Find all persons with name starting with 'S'
        System.out.println("Opg1 g: " + findAll(persons, person -> person.getName().startsWith("s")));

        //Opg1 h: Find all persons with name of length 5.
        System.out.println("Opg1 h: " + findAll(persons, person -> person.getName().length() == 5));

        //Opg1 i: Find all persons with name of length at least 6 and age below 40.
        System.out.println("Opg1 i: " + findAll(persons, person -> person.getName().length() > 6 && person.getAge() < 40));


        System.out.println(persons);
        System.out.println();

    }

    /* Opg1 e: Program a findAll() method. Its signature and implementation must fit the use of the method:
     * List<Person> list1 = findAll(persons, p -> p.getAge() < 30); */
    public static List<Person> findAll(List<Person> list, Predicate<Person> filter) {
        ArrayList<Person> list1 = new ArrayList<>();
        for (Person p : list) {
            if (filter.test(p))
                list1.add(p);
        }
        return list1;
    }


    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }
}
