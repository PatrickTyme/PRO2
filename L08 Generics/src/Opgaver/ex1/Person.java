package Opgaver.ex1;

public class Person<T extends Comparable<T>> implements Comparable<Person<T>> {
    private T name;


    public Person(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }


    @Override
    public int compareTo(Person<T> o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name + "";
    }

}
