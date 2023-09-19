package Opgaver.ex1;

public class FullName implements Comparable<FullName>{
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(FullName o) {
        if (this.getLastName().compareTo(o.lastName) == 0) {
            return this.getFirstName().compareTo(o.firstName);
        } else {
            return this.getLastName().compareTo(o.lastName);
        }
    }

    @Override
    public String toString() {
        return firstName + " " +
                lastName;
    }
}
