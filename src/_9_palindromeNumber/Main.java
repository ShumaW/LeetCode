package _9_palindromeNumber;

public class Main {
    public static void main(String[] args) {
        /*
        Given an integer x, return true if x is a palindrome, and false otherwise.
        Example 1:

        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.
        Example 2:

        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        Example 3:

        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
         */

        int num = 121;
        System.out.println(isPolindrome(num));

        int num2 = -121;
        System.out.println(isPolindrome(num2));

        int num3 = 1441;
        System.out.println(isPolindrome(num3));

    }

    public static boolean isPolindrome(Integer num) {

        if (num < 0 || (num != 0 && num % 10 == 0)){
            return false;
        }
        int rev = 0;
        while (num > rev) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return (num == rev || num == rev / 10);

    }
}
