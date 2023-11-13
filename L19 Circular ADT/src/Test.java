import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        SortedSingleLinkedList<String> cities = new SortedSingleLinkedList<>();

        cities.add("Paris");
        cities.add("London");
        cities.add("Oslo");
        cities.add("Amsterdam");

        System.out.println(cities);

        cities.removeFirst();

        System.out.println(cities);
    }
}
