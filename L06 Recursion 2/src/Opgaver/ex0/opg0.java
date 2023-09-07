package Opgaver.ex0;

public class opg0 {
    /**
     * Make a method that returns the count of even numbers in a list given as parameter. Use a
     * recursive helper method to calculate the count
     */
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        System.out.println(countEven(list));
    }
    public static int countEven(int[] list) {
        return countEven(list, 0);
    }
    public static int countEven(int[] list, int index) {
        if (index == list.length) {
            return 0;
        } else if (list[index] % 2 == 0) {
            return 1 + countEven(list, index + 1);
        } else {
            return countEven(list, index + 1);
        }
    }
}