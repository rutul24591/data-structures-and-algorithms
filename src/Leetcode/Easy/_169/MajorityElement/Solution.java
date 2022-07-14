package Leetcode.Easy._169.MajorityElement;

/*
        @author: Rutul Amin
        @tag: Arrays
        @date: 14 July 2022

        169. Majority Element

        Given an array nums of size n, return the majority element.
        The majority element is the element that appears more than ⌊n / 2⌋ times.
        You may assume that the majority element always exists in the array.

        Example 1:
            Input: nums = [3,2,3]
            Output: 3

        Example 2:
            Input: nums = [2,2,1,1,1,2,2]
            Output: 2

        Constraints:
            n == nums.length
            1 <= n <= 5 * 104
            -109 <= nums[i] <= 109

        Submission details:
            Runtime: 3 ms, faster than 63.33% of Java online submissions for Majority Element.
            Memory Usage: 56.7 MB, less than 20.01% of Java online submissions for Majority Element.

        Time: O(n)  // Boyer-Moore performs constant work exactly n times, so the algorithm runs in linear time.
        SpaceL O(1) // Boyer-Moore allocates only constant additional memory.

*/
public class Solution {
    /* Boyer-Moore Voting Algorithm */
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;   // Refer to InterestingNotes -> DifferenceBetweenIntAndInteger
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count = count + (candidate == num ? 1 : -1);
        }
        return candidate;
    }

    public static void main(String[] args){
        int[] nums = {1,5,4,5,5,6,7,4,5,8,5,5,5,5};
        Solution instance = new Solution();
        int result = instance.majorityElement(nums);
        System.out.println("Result: "+ result);
    }
}
