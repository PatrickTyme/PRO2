package Opgaver.ex2;

public class opg2 {
    public static void main(String[] args) {

    }
//    public static boolean isPalindrome(String s) {
//        if (s.length() <= 1) {
//            return true;
//        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
//            return false;
//        } else return isPalindrome(s.substring(1, s.length() - 1));
//    }

    private static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        } else if (s.charAt(left) != s.charAt(right)){
            return false;
    } else {
            return isPalindrome(s, left + 1, right -1);
        }
}

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        } else {
            return isPalindrome(s, 0, s.length() - 1);

        }
    }
}
