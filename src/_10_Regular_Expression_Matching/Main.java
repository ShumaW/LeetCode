package _10_Regular_Expression_Matching;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
         *
         * '.' Matches any single character.
         * '*' Matches zero or more of the preceding element.
         * The matching should cover the entire input string (not partial).
         *
         * Example 1:
         *
         * Input: s = "aa", p = "a"
         * Output: false
         * Explanation: "a" does not match the entire string "aa".
         * Example 2:
         *
         * Input: s = "aa", p = "a*"
         * Output: true
         * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
         * Example 3:
         *
         * Input: s = "ab", p = ".*"
         * Output: true
         * Explanation: ".*" means "zero or more (*) of any character (.)".
         *
         * Constraints:
         *
         * 1 <= s.length <= 20
         * 1 <= p.length <= 20
         * s contains only lowercase English letters.
         * p contains only lowercase English letters, '.', and '*'.
         * It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
         */

        out.println(isMatch("aa", "a"));
        out.println("aa".matches("a"));
        out.println("-".repeat(50));


        out.println(isMatch("ab", ".*"));
        out.println("ab".matches(".*"));
        out.println("-".repeat(50));

        out.println(isMatch("aab", "c*a*b"));
        out.println("aab".matches("c*a*b"));
        out.println("-".repeat(50));

        out.println(isMatch("mississippi", "mis*is*p*."));
        out.println("mississippi".matches("mis*is*p*."));
        out.println("-".repeat(50));

        out.println(isMatch("aaa", "aaaa"));
        out.println("aaa".matches("aaaa"));
        out.println("-".repeat(50));

        out.println(isMatch("aaa", "a*a"));
        out.println("aaa".matches("a*a"));
        out.println("-".repeat(50));
    }

    public static Result[][] memo;
    public static boolean isMatch(String text, String pattern) {
        memo = new Result[text.length() + 1][pattern.length() + 1];
        return dp(0, 0, text, pattern);
    }

    public static boolean dp(int i, int j, String text, String pattern) {
        if (memo[i][j] != null) {
            return memo[i][j] == Result.TRUE;
        }
        boolean ans;
        if (j == pattern.length()){
            ans = i == text.length();
        } else{
            boolean first_match = (i < text.length() &&
                    (pattern.charAt(j) == text.charAt(i) ||
                            pattern.charAt(j) == '.'));

            if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                ans = (dp(i, j+2, text, pattern) ||
                        first_match && dp(i+1, j, text, pattern));
            } else {
                ans = first_match && dp(i+1, j+1, text, pattern);
            }
        }
        memo[i][j] = ans ? Result.TRUE : Result.FALSE;
        return ans;
    }
}

enum Result {
    TRUE, FALSE
}
