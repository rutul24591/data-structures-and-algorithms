package Leetcode.Medium._78.Subsets;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
        @author: Rutul Amin
        @tag: Arrays, backtracking, bit manipulation
        @date: June 30, 2022

        78. Subsets

        Given an integer array nums of unique elements, return all possible subsets (the power set).
        The solution set must not contain duplicate subsets. Return the solution in any order.

        Example 1:
                Input: nums = [1,2,3]
                Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

        Example 2:
                Input: nums = [0]
                Output: [[],[0]]

        Constraints:
                1 <= nums.length <= 10
                -10 <= nums[i] <= 10
                All the numbers of nums are unique.

        Submission Details:
                Runtime: 2 ms, faster than 36.82% of Java online submissions for Subsets.
                Memory Usage: 43.3 MB, less than 51.23% of Java online submissions for Subsets.

        Time : O(2^n); Space: O()

 */
public class Subsets {
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
                list.add(array[i]);

                /* System.out.println("i: "+i+" List ADD: " +list); */
                backtrack(result, array, list, i + 1);

                // Remove last element from list
                list.remove(list.size() - 1);
                /* System.out.println("i: "+i+" List REMOVE: " +list); */
            }
        }

        /*      ITERATIVE APPROACH
            *   Try to insert each number into all existing subsets
            *   Time : O(2^n); Space: O()
        */

        public List<List<Integer>> subsets2(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);

            // push initial empty subset i.e []
            res.add(new ArrayList<>());

            for (int num : nums) {
                int sz = res.size();
                for (int i = 0; i < sz; i++) {
                    List<Integer> list = new ArrayList<>(res.get(i));
                    list.add(num);
                    res.add(list);
                }
            }
            return res;
        }

        public static void main(String[] args){
            int[] nums = {1,2,3};
            Subsets instance = new Subsets();
            List<List<Integer>> subsets = instance.subsets(nums);
            System.out.println("Subsets: " +subsets);
        }
}
