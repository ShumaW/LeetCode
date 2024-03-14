package _6_ZigzagConversion;

import static java.lang.System.*;

public class MainTask6 {

    /**
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to
     * display this pattern in a fixed font for better legibility)
     * <p>
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * And then read line by line: "PAHNAPLSIIGYIR"
     * <p>
     * Write the code that will take a string and make this conversion given a number of rows:
     * <p>
     * string convert(string s, int numRows);
     */
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";

        out.println(zigZagPrint(str, 6));
    }

    private static String zigZagPrint(String str, int i) {
        int index = 0;
        String[][] array = new String[i][str.length() / 2];
        int row = 0;
        int column = 0;
        while (index < str.length()) {
            while (row < i && index < str.length()) {
                array[row][column] = String.valueOf(str.charAt(index));
                index++;
                row++;
            }
            row = row - 2;
            column++;
            while (row > 0 && index < str.length()) {
                array[row][column] = String.valueOf(str.charAt(index));
                index++;
                row--;
                column++;
            }

        }
        row = 0;
        column = 0;
        for (; row < i; row++) {
            for (; column < str.length() / 2; column++) {
                if (array[row][column] == null){
                    array[row][column] = " ";
                }
            }
            column = 0;
        }
        StringBuilder result = new StringBuilder("");
        row = 0;
        for (; row < i; row++) {
            for (int k = 0; k < str.length() / 2; k++) {
                result.append(array[row][k]);
            }
            result.append("\n");
        }
        return result.toString();
    }
}
