package Opgaver.ex1;

public class opg1 {


    public static void main(String[] args) {
        System.out.println(factorial(10));
        }

    // 1! = 1
    //n! = n*(n-1)!, n>0
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
