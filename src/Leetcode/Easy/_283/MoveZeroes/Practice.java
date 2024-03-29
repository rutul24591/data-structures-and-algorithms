package Leetcode.Easy._283.MoveZeroes;

import java.util.Arrays;

public class Practice {
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
        Practice instance = new Practice();
        int[] nums= {0,1,0,2,3,14,12};
        instance.moveZeroes(nums);
    }
}
