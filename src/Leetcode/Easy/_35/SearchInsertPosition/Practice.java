package Leetcode.Easy._35.SearchInsertPosition;

import java.util.Arrays;

public class Practice {
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
        Practice instance = new Practice();
        int[] nums = {1,3,5,6};
//      int[] nums2 = {1,3,5,6}, target = 5;
        int target = 4;
        int result = instance.searchInsert(nums, target);

        System.out.println("Target: " +target);
        System.out.println("Nums: " + Arrays.toString(nums));

        System.out.println("Result:" + result);
    }
}
