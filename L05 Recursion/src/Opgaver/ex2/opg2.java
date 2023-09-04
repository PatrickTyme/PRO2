package Opgaver.ex2;

public class opg2 {

    public static void main(String[] args) {
        System.out.println(power(2, 4));
        System.out.println(power2(2, 4));
    }
    public static int power(int n, int p) {
        if (p == 0) {
            return 1;
        } else {
            return power(n, p - 1) * n;
        }
    }

    public static int power2(int n, int p) {
        int result = 0;
        if (p == 0) {
            return 1;
        } else if (p > 0 && p % 2 != 0) {
            result = power2(n, p - 1) * n;
        } else if (p > 0 && p % 2 == 0) {
            result = power2((n * n), p / 2);
        } return result;
        }
}
