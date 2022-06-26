package Leetcode.Easy._35.SearchInsertPosition;

import java.util.Arrays;

/*
    35. Search Insert Position

        Given a sorted array of distinct integers and a target value, return the index if the target is found.
        If not, return the index where it would be if it were inserted in order.

        You must write an algorithm with O(log n) runtime complexity.

        Example 1:

            Input: nums = [1,3,5,6], target = 5
            Output: 2

        Example 2:

            Input: nums = [1,3,5,6], target = 2
            Output: 1

        Example 3:

            Input: nums = [1,3,5,6], target = 7
            Output: 4


        Constraints:

            1 <= nums.length <= 104
            -104 <= nums[i] <= 104
            nums contains distinct values sorted in ascending order.
            -104 <= target <= 104

        Submission Details for approach 1:
            Runtime: 15 ms, faster than 11.57% of Java online submissions for Search Insert Position.
            Memory Usage: 42.4 MB, less than 81.39% of Java online submissions for Search Insert Position.
 */

public class SearchInsertPosition {
    /* Approach 1. My old version. not time efficient*/
    public int searchInsert(int[] nums, int target) {
        int position = 0;
        if(target > nums[nums.length - 1]){
            position = nums.length;
            return position;
        }else if(target < nums[0]){
            position = 0;
            return position;
        }else{
            for(int i = 0; i < nums.length; i++){
                System.out.println("i" +i);
                if(nums[i] == target){
                    return i;
                }else if(nums[i] < target){
                    position++;
                }
            }
        }
        return position;
    }

    public static void main(String[] args) {
        SearchInsertPosition instance = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
//      int[] nums2 = {1,3,5,6}, target = 5;
        int target = 4;
        int result = instance.searchInsert(nums, target);

        System.out.println("Target: " +target);
        System.out.println("Nums: " + Arrays.toString(nums));

        System.out.println("Result:" + result);
    }
}
