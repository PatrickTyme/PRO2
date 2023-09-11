package Opgaver.ex1;

public class opg1 {
    public static void main(String[] args) {
        System.out.println(binomial(5, 2));
        printBinomial(7);
    }

    /** Pre N < M */
    public static int binomial(int n, int m) {
        if (m == 0 || m == n) {
            return 1;
        } else {
            return binomial(n - 1, m) + binomial(n - 1, m - 1);
        }
    }
     public static void printBinomial(int n) {
         for (int i = 0; i <= n; i++) {
             for (int j = 0; j <= i; j++) {
                 System.out.print(binomial(i, j) + " ");
             }
             System.out.println();
         }
     }
}
