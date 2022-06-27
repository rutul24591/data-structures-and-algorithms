package Leetcode.Easy._217.ContainsDuplicate;

import java.util.HashSet;

/**
        @author:    Rutul Amin
        @tag :      Array; Hash Set
        @date:      Jun 27, 2022

        217.    Contains Duplicate

                Given an integer array nums,
                return true if any value appears at least twice in the array,
                and return false if every element is distinct.

                Example 1:
                    Input: nums = [1,2,3,1]
                    Output: true

                Example 2:
                    Input: nums = [1,2,3,4]
                    Output: false

                Example 3:
                    Input: nums = [1,1,1,3,3,4,3,2,4,2]
                    Output: true


                Constraints:
                    1 <= nums.length <= 105
                    -109 <= nums[i] <= 109

                Submission Details:
                    Runtime: 4 ms
                    Memory Usage: 43.6 MB

                Note:
                    Read description again as its a bit confusing. We got to return true if elements are not distinct and
                    false if elements are distinct.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        ContainsDuplicate instance = new ContainsDuplicate();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        int[] nums2 = {1,2,3,4,5,6};

        System.out.println("Result for nums: " +instance.containsDuplicate(nums));
        System.out.println("Result for nums2: " +instance.containsDuplicate(nums2));
    }
}
