package Opg2;

public class Customer implements Comparable<Customer> {
    private String firstName;
    private String lastName;
    private int age;

    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Customer o) {
        int lastNameCompare = this.lastName.compareTo(o.lastName);
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }
        int firstNameCompare = this.firstName.compareTo(o.firstName);
        if (firstNameCompare != 0) {
            return firstNameCompare;
        }
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Customer: " + "firstName= '" + firstName + '\'' + ", lastName= '" + lastName + '\'' + ", age= " + age + '}';
    }
}
