package Leetcode.Medium._34.FindFirstAndLastPosOfElementInSortedArray;

import java.util.Arrays;

/*
        @author: Rutul Amin
        @tag: Arrays, Binary Search
        @date: 14th July 2022

        34. Find First and Last Position of Element in Sorted Array

        Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
        If target is not found in the array, return [-1, -1].

        You must write an algorithm with O(log n) runtime complexity.

        Example 1:
            Input: nums = [5,7,7,8,8,10], target = 8
            Output: [3,4]

        Example 2:
            Input: nums = [5,7,7,8,8,10], target = 6
            Output: [-1,-1]

        Example 3:
            Input: nums = [], target = 0
            Output: [-1,-1]


        Constraints:
            0 <= nums.length <= 105
            -109 <= nums[i] <= 109
            nums is a non-decreasing array.
            -109 <= target <= 109

       Submission Details:
            Runtime: 1 ms, faster than 38.49% of Java online submissions for Find First and Last Position of Element in Sorted Array.
            Memory Usage: 47.4 MB, less than 39.99% of Java online submissions for Find First and Last Position of Element in Sorted Array.

       Time : O(lgN);
       Space: O(N)

       Approach
           1. Find the last index using binary search
           2. Assign the values.
           3. Reset the values of left and right.
           4. Find the first index using binary search
           5. Return result

*/
public class Solution {
    /* 1. Verbose but easy to understand */
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int n = nums.length;
        int left = 0, right = n - 1;
        //Find the last index and assign to last element of result
        while(left <= right){
            int mid = left + (right - left) / 2; // left + right/2
            if(nums[mid] == target){
                result[1] = mid;
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        //Reset the values of left and right
        left = 0;
        right = n - 1;

        //Find the first index and assign to first element of result
        while(left <= right){
            int mid = left + (right - left) / 2; // left + right/2
            if(nums[mid] == target){
                result[0] = mid;
                right = mid - 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        //Return the result array
        return result;
    }





    /* 2. Cleaner solution. Same as above but less verbose

        Submission details
            Runtime: 0 ms, faster than 100.00% of Java online submissions for Find First and Last Position of Element in Sorted Array.
            Memory Usage: 48 MB, less than 6.08% of Java online submissions for Find First and Last Position of Element in Sorted Array.

        Time : O(lgN);
        Space: O(N)
    */
    public int[] searchRange2(int[] nums, int target) {
        int[] result = {-1,-1};
        int left = search(nums, target,true);
        int right = search(nums, target,false);
        result[0] = left;
        result[1] = right;

        return result;
    }

    public int search(int[]nums, int target,boolean findFirstIndex){
        int ans = -1;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left+(right - left) / 2;
            if(target < nums[mid]){
                right = mid-1;
            }
            else if(target>nums[mid]){
                left = mid+1;
            }
            else{
                ans = mid;
                if(findFirstIndex){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {1,4,5,5,6,7,8};
        int target = 5;
        Solution instance = new Solution();
        int[] result = instance.searchRange(nums, target);
        System.out.println("Result: "+ Arrays.toString(result));
    }
}
