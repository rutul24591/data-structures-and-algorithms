package Leetcode.Easy._136.SingleNumber;

/**
        @author: Rutul Amin
        @tag: Bit manipulation, Operators, top100interviewquestions
        @date: 29th June 2022

        136. Single Number

        Given a non-empty array of integers nums, every element appears twice except for one.
        Find that single one.
        You must implement a solution with a linear runtime complexity and use only constant extra space.

         Example 1:
             Input: nums = [2,2,1]
             Output: 1

         Example 2:
             Input: nums = [4,1,2,1,2]
             Output: 4

         Example 3:
             Input: nums = [1]
             Output: 1

         Constraints:
             1 <= nums.length <= 3 * 104
             -3 * 104 <= nums[i] <= 3 * 104
             Each element in the array appears twice except for one element which appears only once.

         Submission Details
             Runtime: 2 ms, faster than 61.94% of Java online submissions for Single Number.
             Memory Usage: 50.5 MB, less than 52.72% of Java online submissions for Single Number.

         Approach:
                Make use XOR operator.
                Store first element in result. Iterate over array starting from position 1.
                XOR(^) result & array[i] and store in result.
                Return result

        Time : O(N) ; Space: O(1)
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int result = nums[0];

        for(int i = 1 ; i < nums.length; i++){
            result = result ^ nums[i]; // XOR operator
        }

        return result;
    }

    public static void main(String[] args){
        SingleNumber instance = new SingleNumber();
        int[] nums = {4,1,2,1,2};

        int result = instance.singleNumber(nums);
        System.out.println("Result: " +result);
    }
}
