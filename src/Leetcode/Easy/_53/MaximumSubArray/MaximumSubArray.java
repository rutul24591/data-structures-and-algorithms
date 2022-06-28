package Leetcode.Easy._53.MaximumSubArray;

/**     @author: Rutul Amin
        @tag: Array, Easy
        53. Maximum Subarray

            Given an integer array nums, find the contiguous subarray (containing at least one number)
            which has the largest sum and return its sum.

            A subarray is a contiguous part of an array.



             Example 1:
                 Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
                 Output: 6
                 Explanation: [4,-1,2,1] has the largest sum = 6.

             Example 2:
                 Input: nums = [1]
                 Output: 1

             Example 3:
                 Input: nums = [5,4,-1,7,8]
                 Output: 23


             Constraints:
                 1 <= nums.length <= 105
                 -104 <= nums[i] <= 104

             Submission Details:
                 Runtime: 2 ms, faster than 67.76% of Java online submissions for Maximum Subarray.
                 Memory Usage: 74.7 MB, less than 31.77% of Java online submissions for Maximum Subarray.

            Follow up:
                If you have figured out the O(n) solution,
                try coding another solution using the divide and conquer approach, which is more subtle.

 */
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }else if(nums.length == 1){
            return nums[0];
        }

        int result = nums[0];
        int maxSum = result;

        for(int i = 1; i< nums.length; i++){
            if(maxSum < 0){
                maxSum = nums[i];
            }else{
                maxSum = maxSum + nums[i];
            }
            result = Math.max(result, maxSum);
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArray instance = new MaximumSubArray();
        int max_sum = instance.maxSubArray(nums);

        System.out.println("Max SUM: "+max_sum);
    }
}
