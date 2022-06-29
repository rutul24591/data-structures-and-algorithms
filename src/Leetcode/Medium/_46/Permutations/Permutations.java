package Leetcode.Medium._46.Permutations;

import java.util.ArrayList;
import java.util.List;

/**     @author: Rutul Amin
        @tag: Arrays, backtracking, Top-100-interview-questions
        @date: 29th June 2022

        46. Permutations

        Given an array nums of distinct integers, return all the possible permutations.
        You can return the answer in any order.

         Example 1:
             Input: nums = [1,2,3]
             Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

         Example 2:
             Input: nums = [0,1]
             Output: [[0,1],[1,0]]

         Example 3:
             Input: nums = [1]
             Output: [[1]]

        Constraints:
             1 <= nums.length <= 6
             -10 <= nums[i] <= 10
             All the integers of nums are unique.

        Submission Details:
             Runtime: 2 ms, faster than 74.31% of Java online submissions for Permutations.
             Memory Usage: 44.7 MB, less than 45.70% of Java online submissions for Permutations.

 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, int s){
        if(s == nums.length){
            result.add(toList(nums));
        }
        for(int i = s; i < nums.length; i++){
            swap(i, s, nums);
            backtrack(result, nums, s+1);
            swap(i, s, nums);
        }
    }

    private List<Integer> toList(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int i : nums){
            res.add(i);
        }
        return res;
    }

    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Permutations instance = new Permutations();
        List<List<Integer>> result = instance.permute(nums);
        System.out.println("Result: " + result);
    }
}
