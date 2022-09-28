package Leetcode.Medium._287.FindTheDuplicateNumber;

import java.util.Arrays;

public class Practice {
    public int findDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1])
                return nums[i];
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,4,5,3,7,3};
        Solution instance = new Solution();
        int result = instance.findDuplicate2(nums);
        System.out.println("Result: "+result);
    }
}
