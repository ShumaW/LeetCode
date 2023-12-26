package _4_medianFromTwoArrays;

public class MainTask4 {
    /**
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
     * <p>
     * The overall run time complexity should be O(log (m+n)).
     */

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 21,45};
        int[] arr2 = {4, 8,10, 12};

//        System.out.println(Arrays.toString(getMergedSortedArray(arr1, arr2)));

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;
        int length = nums1.length + nums2.length;
        int[] mergedArray = new int[length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (nums1[index1] > nums2[index2] && nums2[index2] != 0) {
                mergedArray[i] = nums2[index2];
                nums2[index2] = 0;
                if (index2 < nums2.length - 1){
                    index2++;
                }
            } else if (nums1[index1] < nums2[index2] && nums1[index1] != 0){
                mergedArray[i] = nums1[index1];
                nums1[index1] = 0;
                if (index1 < nums1.length - 1) {
                    index1++;
                }
            } else if (nums2[index2] == 0) {
                mergedArray[i] = nums1[index1];
                if (index1 < nums1.length - 1){
                    index1++;
                }
            } else if (nums1[index1] == 0) {
                mergedArray[i] = nums2[index2];
                if (index2 < nums2.length - 1){
                    index2++;
                }
            }
        }
        if (mergedArray.length % 2 == 0) {
            result = (mergedArray[(mergedArray.length - 1) / 2] + mergedArray[(mergedArray.length - 1) / 2 + 1]) / 2.0;
        } else {
            result = mergedArray[(mergedArray.length - 1) / 2];
        }
        return result;
    }

    public static int[] getMergedSortedArray(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] mergedArray = new int[length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (nums1[index1] > nums2[index2] && nums2[index2] != 0) {
                mergedArray[i] = nums2[index2];
                nums2[index2] = 0;
                if (index2 < nums2.length - 1){
                    index2++;
                }
            } else if (nums1[index1] < nums2[index2] && nums1[index1] != 0){
                mergedArray[i] = nums1[index1];
                nums1[index1] = 0;
                if (index1 < nums1.length - 1) {
                    index1++;
                }
            } else if (nums2[index2] == 0) {
                mergedArray[i] = nums1[index1];
                if (index1 < nums1.length - 1){
                    index1++;
                }
            } else if (nums1[index1] == 0) {
                mergedArray[i] = nums2[index2];
                if (index2 < nums2.length - 1){
                    index2++;
                }
            }
        }
        return mergedArray;
    }
}
