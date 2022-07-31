package Leetcode.Easy._283.MoveZeroes;

import java.util.Arrays;

/*
        @author: Rutul Amin
        @tag: Arrays, Two Pointer, 14-day-challenge
        @date: 29th July 2022

        283. Move Zeroes

        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
        Note that you must do this in-place without making a copy of the array.

        Example 1:
            Input: nums = [0,1,0,3,12]
            Output: [1,3,12,0,0]

        Example 2:
            Input: nums = [0]
            Output: [0]

        Constraints:
            1 <= nums.length <= 104
            -231 <= nums[i] <= 231 - 1

        Follow up: Could you minimize the total number of operations done?

        Submission Details:
            Runtime: 1 ms, faster than 100.00% of Java online submissions for Move Zeroes.
            Memory Usage: 43.8 MB, less than 88.44% of Java online submissions for Move Zeroes.

        Time: O(n)  //  However, the total number of operations are still sub-optimal. The total operations (array writes) that code does is
                        n (Total number of elements).
        Space: O(1) //  Only constant space is used.
*/
public class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        // If the current element is not 0, then we need to
        // append it just in front of last non 0 element we found.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }
        // After we have finished processing new elements,
        // all the non-zero elements are already at beginning of array.
        // We just need to fill remaining array with 0's.
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println("Nums after moving zeroes to end: " + Arrays.toString(nums));
    }

    public static void main(String[] args){
        Solution instance = new Solution();
        int[] nums= {0,1,0,2,3,14,12};
        instance.moveZeroes(nums);
    }
}
