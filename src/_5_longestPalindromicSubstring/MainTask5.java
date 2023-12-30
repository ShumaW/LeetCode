package _5_longestPalindromicSubstring;

import java.util.Arrays;

public class MainTask5 {
    /**
     * Given a string s, return the longest palindromic substring in s.
     * Example 1:
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * <p>
     * Example 2:
     * Input: s = "cbbd"
     * Output: "bb"
     */
    public static void main(String[] args) {
        String str1 = "babad";
        System.out.println(longestPalindrome(str1));
    }

    public static String longestPalindrome(String s) {
        String res = "";
        char[] chars = s.toCharArray();
        int right = chars.length - 1;
        int[] temp = new int[chars.length];
        System.out.println(Arrays.toString(temp));
        for (int left = 0; left < chars.length; left++) {
            if (chars[left] != chars[right]) {
                right--;
            } else {
                while (left < right) {
                    if (chars[left] == chars[right]) {
                        temp[left] = chars[left];
                        temp[right] = chars[right];
                        left++;
                        right--;
                    }
                }
                if (left == right){
                    temp[left] = chars[left];
                }
            }

        }

        System.out.println(Arrays.toString(temp));
        for (int a : temp){
            if (a != 0){
                res = res + (char) a;
            }
        }
        return res;
    }
}
