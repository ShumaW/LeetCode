package _7_Reverse_Integer;

public class Main {
    public static void main(String[] args) {
        /**
         * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go
         * outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
         *
         * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
         *
         * Example 1:
         * Input: x = 123
         * Output: 321
         *
         * Example 2:
         * Input: x = -123
         * Output: -321
         *
         * Example 3:
         * Input: x = 120
         * Output: 21
         */
        System.out.println(reverse(1234));
    }

    public static int reverse(int x) {
        StringBuilder temp;
        String string = "";
        if (x > 0){
            temp = new StringBuilder("" + x);
            string = temp.reverse().toString();
        }

        if (x < 0){
            temp = new StringBuilder(String.valueOf(x).substring(1));
            string = "-" + temp.reverse();
        }
        return Integer.parseInt(string);
    }
}
