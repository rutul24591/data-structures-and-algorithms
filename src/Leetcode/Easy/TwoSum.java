package Leetcode.Easy;

/*
    PROBLEM 1:
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.



        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]


        Constraints:

        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        Only one valid answer exists.


        Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/

import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] array, int target) {
        int[] resultantArray = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int iterator = 0; iterator < array.length ; iterator++){
            if(map.containsKey(target - array[iterator])){
                resultantArray[1] = iterator;
                resultantArray[0] = map.get(target-array[iterator]);
                return resultantArray;
            }else{
                map.put(array[iterator], iterator);
            }
        }
        return resultantArray;
    }

    /*
     Solution : o(n^2)
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; ++i) {
                for (int j = i + 1; j < nums.length; ++j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }
    */

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = { 2,4,5,7,9,11 };
        int target = 20;   // try 22;

        int[] result = solution.twoSum(nums, target);
        System.out.println("Result: " +Arrays.toString(result));
    }
}
