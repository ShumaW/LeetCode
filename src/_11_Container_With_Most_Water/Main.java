package _11_Container_With_Most_Water;

public class Main {
    public static void main(String[] args) {
        /**
         * You are given an integer array height of length n. There are n vertical lines drawn such that the
         * two endpoints of the ith line are (i, 0) and (i, height[i]).
         *
         * Find two lines that together with the x-axis form a container, such that the container contains the most water.
         *
         * Return the maximum amount of water a container can store.
         *
         * Notice that you may not slant the container.
         *
         * Example 1:
         * Input: height = [1,8,6,2,5,4,8,3,7]
         * Output: 49
         * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max
         * area of water (blue section) the container can contain is 49.
         *
         * Example 2:         *
         * Input: height = [1,1]
         * Output: 1
         *
         */
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height1));

        int[] height2 = {1,1};
        System.out.println(maxArea(height2));

    }

    public static int maxArea(int[] height) {
        int multi = 0;
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] <= height[j]){
                    multi = (j - i) * height[i];
                }
                if (height[i] > height[j]){
                    multi = (j - i) * height[j];
                }
                max = Math.max(max, multi);
            }
        }
        return max;
    }
}
