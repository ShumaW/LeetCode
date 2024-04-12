package _16_3Sum_Closest;

import java.util.Arrays;

public class Main {
    /**
     * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is
     * closest to target.
     * <p>
     * Return the sum of the three integers.
     * <p>
     * You may assume that each input would have exactly one solution.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [-1,2,1,-4], target = 1
     * Output: 2
     * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [0,0,0], target = 1
     * Output: 0
     * Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
     */
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(threeSumClosest(nums, 2));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int[] array = Arrays.stream(nums).sorted().toArray();
        int result = 0;
        long value = 2L * Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 2; i++) {
            int k = i + 1;
            int j = array.length - 1;
            while (k < j) {
                int sum = array[i] + array[k] + array[j];
                // This printout is only for viewing how the program works.
                System.out.println("-".repeat(50));
                System.out.println(sum);
                System.out.println(array[i] + " : " +  array[k]+ " : " + array[j]);
                System.out.println("-".repeat(50));
                if (sum > target) {
                    j--;
                    if (value > Math.abs(sum - target)) {
                        value = Math.abs(sum - target);
                        result = sum;
                    }
                } else if (sum < target) {
                    k++;
                    if (value > Math.abs(sum - target)) {
                        value = Math.abs(sum - target);
                        result = sum;
                    }
                } else {
                    k++;
                    j--;
                    result = sum;
                }
            }
        }
        return result;
    }
}

