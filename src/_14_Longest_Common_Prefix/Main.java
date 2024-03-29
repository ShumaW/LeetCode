package _14_Longest_Common_Prefix;

public class Main {
    public static void main(String[] args) {
        /**
         * Write a function to find the longest common prefix string amongst an array of strings.
         *
         * If there is no common prefix, return an empty string "".
         *
         *
         *
         * Example 1:
         *
         * Input: strs = ["flower","flow","flight"]
         * Output: "fl"
         * Example 2:
         *
         * Input: strs = ["dog","racecar","car"]
         * Output: ""
         * Explanation: There is no common prefix among the input strings.
         *
         *
         * Constraints:
         *
         * 1 <= strs.length <= 200
         * 0 <= strs[i].length <= 200
         * strs[i] consists of only lowercase English letters.
         */

        String[] strs1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs1));
        System.out.println("-".repeat(50));

        String[] strs2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs2));
        System.out.println("-".repeat(50));

        String[] strs3 = {"dog"};
        System.out.println(longestCommonPrefix(strs3));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder("");
        if (strs.length == 0){
            return prefix.toString();
        }
        if (strs.length == 1){
            return prefix.append(strs[0]).toString();
        }
        for (int i = 1; i < strs.length ; i++) {
            if (strs[i - 1].charAt(0) != strs[i].charAt(0)){
                break;
            }
            for (int j = 0; j < strs.length; j++) {
                if (strs[i - 1].charAt(j) == strs[i].charAt(j)
                        && !prefix.toString().contains(String.valueOf(strs[i].charAt(j)))){
                    prefix.append(strs[i].charAt(j));
                } else if (prefix.toString().charAt(j) != strs[i].charAt(j)){
                    prefix.deleteCharAt(prefix.length() - 1);
                }
            }
        }
        return prefix.toString();
    }
}
