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

        Time Complexity: O(log n)
        Auxiliary Space: O(log n)

 */

public class SearchInsertPosition {

    /* Binary Search Iterative
        Time Complexity: O(log n)
        Auxiliary Space: O(log n)
    */
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        // loop till the search space is exhausted
        while(low <= high){
            // find the mid-value in the search space and
            // compares it with the target
            int mid = (low + high) / 2;

            // target value is found
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                // if the target is less than the middle element, discard all elements
                // in the right search space, including the middle element
                high = mid - 1;
            }else {
                // if the target is more than the middle element, discard all elements
                // in the left search space, including the middle element
                low = mid + 1;
            }
        }
        return low;
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
