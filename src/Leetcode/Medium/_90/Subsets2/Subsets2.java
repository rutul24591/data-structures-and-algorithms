package Leetcode.Medium._90.Subsets2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
         @author: Rutul Amin
         @tag: Arrays, backtracking, bit manipulation
         @date: June 30, 2022

         78. Subsets

         Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
         The solution set must not contain duplicate subsets. Return the solution in any order.

         Example 1:
             Input: nums = [1,2,2]
             Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

         Example 2:
             Input: nums = [0]
             Output: [[],[0]]

         Constraints:
             1 <= nums.length <= 10
             -10 <= nums[i] <= 10

         Submission Details:
             Runtime: 2 ms, faster than 84.28% of Java online submissions for Subsets II.
             Memory Usage: 44.6 MB, less than 12.85% of Java online submissions for Subsets II.

         Time : O(2^N); Space: O(2^N)

 */
public class Subsets2 {
        /* Recursive backtracking approach */
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            int position = 0;
            // Sort the nums array to put elements in descending order
            Arrays.sort(nums);
            backtrack(result, nums, list, position);
            return result;
        }

        public void backtrack(List<List<Integer>> result, int[] array, List<Integer> list, int position) {
            // This will add list(array) to result array.
            result.add(new ArrayList<>(list));
            // Loop nums
            for(int i = position; i < array.length; i++){
                /* Next if condition is the only difference between Subsets and subsets 2 problem */
                if (i != position && array[i] == array[i - 1]) {
                    continue;
                }
                list.add(array[i]);

                /* System.out.println("i: "+i+" List ADD: " +list); */
                backtrack(result, array, list, i + 1);

                // Remove last element from list
                list.remove(list.size() - 1);
                /* System.out.println("i: "+i+" List REMOVE: " +list); */
            }
        }


        public static void main(String[] args){
            int[] nums = {1,2,2};
            Subsets2 instance = new Subsets2();
            List<List<Integer>> subsets = instance.subsets(nums);
            System.out.println("Subsets: " +subsets);
        }
}
