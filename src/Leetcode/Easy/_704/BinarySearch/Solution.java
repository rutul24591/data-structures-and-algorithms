package Leetcode.Easy._704.BinarySearch;

/*
        @author: Rutul Amin
        @tag: Binary Search
        @date: 27th July 2022

        704. Binary Search

        Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
        If target exists, then return its index. Otherwise, return -1.

        You must write an algorithm with O(log n) runtime complexity.

        Example 1:
            Input: nums = [-1,0,3,5,9,12], target = 9
            Output: 4
            Explanation: 9 exists in nums and its index is 4

        Example 2:
            Input: nums = [-1,0,3,5,9,12], target = 2
            Output: -1
            Explanation: 2 does not exist in nums so return -1


        Constraints:
            1 <= nums.length <= 104
            -104 < nums[i], target < 104
            All the integers in nums are unique.
            nums is sorted in ascending order.

        Submission Details:
            Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
            Memory Usage: 54.2 MB, less than 59.55% of Java online submissions for Binary Search.

        Time: O(log n)  // Binary Search algorithm
        Space: O(1) // No extra space needed
*/
public class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(high >= low){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int target = 9;
        int[] nums = {-1,0,4,6,9,15,26};

        Solution instance = new Solution();
        int reversedInteger = instance.search(nums, target);
        System.out.println("Reversed Integer: " +reversedInteger);
    }
}
