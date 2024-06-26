package _15_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.out;

public class Main {
    /**
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k,
     * and j != k, and nums[i] + nums[j] + nums[k] == 0.
     * <p>
     * Notice that the solution set must not contain duplicate triplets.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [-1,0,1,2,-1,-4]
     * Output: [[-1,-1,2],[-1,0,1]]
     * Explanation:
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
     * The distinct triplets are [-1,0,1] and [-1,-1,2].
     * Notice that the order of the output and the order of the triplets does not matter.
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [0,1,1]
     * Output: []
     * Explanation: The only possible triplet does not sum up to 0.
     * <p>
     * Example 3:
     * <p>
     * Input: nums = [0,0,0]
     * Output: [[0,0,0]]
     * Explanation: The only possible triplet sums up to 0.
     */
    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        out.println(threeSum1(nums1));
        out.println(threeSum2(nums1));
        out.println("-".repeat(50));

        int[] nums2 = {0, 1, 1};
        out.println(threeSum1(nums2));
        out.println(threeSum2(nums2));
        out.println("-".repeat(50));

        int[] nums3 = {0, 0, 0};
        out.println(threeSum1(nums3));
        out.println(threeSum2(nums3));
        out.println("-".repeat(50));

        int[] nums4 = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        out.println(threeSum1(nums4));
        out.println("-".repeat(50));
        out.println(threeSum2(nums4));
    }

    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        result.add(Stream.of(nums[i], nums[j], nums[k])
                                .sorted()
                                .toList());
                    }
                }
            }
        }
        return result.stream()
                .distinct()
                .toList();
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int k = i + 1;
            int j = nums.length - 1;
            while (k < j) {
                int sum = nums[i] + nums[k] + nums[j];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[k], nums[j]));
                    k++;
                    j--;
                } else if (sum < 0) {
                    k++;
                } else {
                    j--;
                }
            }
        }
        return result.stream()
                .distinct()
                .toList();
    }
}
