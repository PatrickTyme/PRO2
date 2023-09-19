package Opgaver.ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Person<String> person1 = new Person<>("Hanne");
        System.out.println(person1);
        Person<String> personString = new Person<>("Jens");
        System.out.println(personString);


        FullName fullName = new FullName("Jens", "Hansen");
        Person<FullName> personFullName = new Person<>(fullName);
        System.out.println(personFullName);

        FullName fullName1 = new FullName("Kurt", "Kragh");
        Person<FullName> pf1 = new Person<>(fullName1);
        System.out.println(pf1);

        Person person2 = new Person("Jens");


        // eller
        Person<FullName> fullNamePerson = new Person<>(new FullName("Bo", "Hamburger"));
        System.out.println(fullNamePerson);

        System.out.println("-----");

        System.out.println(person1.compareTo(personString));
        System.out.println("------");
        System.out.println(personFullName.compareTo(fullNamePerson));

        System.out.println("......");
        ArrayList<Person<FullName>> fpList = new ArrayList<>();
        fpList.add(pf1);
        fpList.add(personFullName);
        fpList.add(fullNamePerson);
        System.out.println(fpList);

        Collections.sort(fpList);
        System.out.println("*******");
        System.out.println(fpList);


    }
}
