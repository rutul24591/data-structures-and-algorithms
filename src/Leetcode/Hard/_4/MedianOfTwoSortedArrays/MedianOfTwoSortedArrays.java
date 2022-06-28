package Leetcode.Hard._4.MedianOfTwoSortedArrays;

import common.ListNode;

import java.util.Arrays;

/**
        @author: Rutul Amin
        @tag: hard, arrays
        @date: 28th June 22

        4.  Median of Two Sorted Arrays

            Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

            The overall run time complexity should be O(log (m+n)).



             Example 1:
                 Input: nums1 = [1,3], nums2 = [2]
                 Output: 2.00000
                 Explanation: merged array = [1,2,3] and median is 2.

             Example 2:
                 Input: nums1 = [1,2], nums2 = [3,4]
                 Output: 2.50000
                 Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


             Constraints:
                 nums1.length == m
                 nums2.length == n
                 0 <= m <= 1000
                 0 <= n <= 1000
                 1 <= m + n <= 2000
                 -106 <= nums1[i], nums2[i] <= 106

            Submission Details:
                Runtime: 411 ms, faster than 5.12% of Java online submissions for Median of Two Sorted Arrays.
                Memory Usage: 55.5 MB, less than 5.01% of Java online submissions for Median of Two Sorted Arrays.

            NOTE:
                The below solution might not of 0(log(n+m)).

            TODO:
                Might be a much better way doing binary search.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length + nums2.length];
        int temp = 0;
        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length){
            System.out.println("nums1[i]: " + nums1[i]);
            System.out.println("nums2[j]: " + nums2[j]);
            if(nums1[i] <= nums2[j]){
                output[temp] = nums1[i];
                temp++;
                i++;
            }else{
                output[temp] = nums2[j];
                temp++;
                j++;
            }
        }
        System.out.println("i: " + i);
        System.out.println("j: " + j);

        while(i < nums1.length){
            output[temp] = nums1[i];
            temp++;
            i++;
        }

        while(j < nums2.length){
            output[temp] = nums2[j];
            temp++;
            j++;
        }

        if(output.length % 2 == 1){
            double median;
            median = output[output.length / 2];
            return median;
        }
        int mid = output.length / 2;
        System.out.println("Output array: " + Arrays.toString(output));
        double median =  (output[mid] + output[mid-1]);
        System.out.println("median: " + median);
        return median/2;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {1,3,4,6};
        double result = new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1, nums2);
        System.out.println("Result: " + result);
    }
}
