package Opg2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Hans", "Hansen", 20);
        Customer customer1 = new Customer("Jens", "Jensen", 18);

        Customer[] customers = new Customer[2];
        customers[0] = customer;
        customers[1] = customer1;

        System.out.println(biggestCustomer(customers));
        Customer[] max = biggerThanCustomer(customers, customer);
        System.out.println(Arrays.toString(max));

    }
    public static Customer biggestCustomer(Customer[] customers) {
        Customer biggest = customers[0];
        for (Customer customer : customers) {
            if (customer.compareTo(biggest) > 0) {
                biggest = customer;
            }
        }
        return biggest;
    }
    public static Customer[] biggerThanCustomer(Customer[] customers, Customer customer) {
        int count = 0;
        for (Customer c1 : customers) {
            if (c1.compareTo(customer) > 0) {
                count++;
            }
        }
        Customer[] bigger = new Customer[count];
        int i = 0;
        for (Customer c1 : customers) {
            if (c1.compareTo(customer) > 0) {
                bigger[i] = c1;
                i++;
            }
        }
        return bigger;
    }
}
