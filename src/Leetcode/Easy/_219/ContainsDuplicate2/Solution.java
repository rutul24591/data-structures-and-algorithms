package Leetcode.Easy._219.ContainsDuplicate2;

/*
        @author: Rutul Amin
        @tag: HashMap, Arrays
        @date: 26th July 2022

        219. Contains Duplicate II

        Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

        Example 1:
            Input: nums = [1,2,3,1], k = 3
            Output: true

        Example 2:
            Input: nums = [1,0,1,1], k = 1
            Output: true

        Example 3:
            Input: nums = [1,2,3,1,2,3], k = 2
            Output: false

        Constraints:
            1 <= nums.length <= 105
            -109 <= nums[i] <= 109
            0 <= k <= 105

        Submission Details:
            Runtime: 34 ms, faster than 71.04% of Java online submissions for Contains Duplicate II.
            Memory Usage: 95.7 MB, less than 14.58% of Java online submissions for Contains Duplicate II.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && Math.abs(i- map.get(nums[i])) <= k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        Solution instance = new Solution();
        boolean result = instance.containsNearbyDuplicate(nums, k);
        System.out.println("Result: " +result);
    }
}
