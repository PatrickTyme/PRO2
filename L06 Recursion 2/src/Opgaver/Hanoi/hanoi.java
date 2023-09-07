package Opgaver.Hanoi;

public class hanoi {
    public static void main(String[] args) {
        move(4, 1, 3); // 4 diske fra 1 (=A) til 3 (=C)
        }
        // move n disks from ‘from’ to ‘to’
        public static void move(int n, int from, int to) {
            if (n == 1) {
                System.out.println("Move: " + from + " -> " + to);
            } else {
                int other = 6 - from - to;
                move(n - 1, from, other);
                System.out.println("Move: " + from + " -> " + to);
                move(n - 1, other, to);
            }
        }
    }
