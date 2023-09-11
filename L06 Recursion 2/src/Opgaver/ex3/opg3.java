package Opgaver.ex3;

public class opg3 {

    // calcNo(n) = calcNo(n-1) + calcNo(n - 2) + 3 * calcNo(n - 3);
    /** Pre n >= 0 */
    public static int calcNo(int n) {
     if (n == 0) {
         return 2;
        } else if (n == -1) {
         return 1;
     } else if (n == -2) {
         return 5;
     } else if (n % 2 == 0) {
         return 2 * calcNo(n-3) - calcNo(n - 1);
     } else {
         return calcNo(n - 1) + calcNo(n - 2) + 3 * calcNo(n - 3);
     }
    }
}
