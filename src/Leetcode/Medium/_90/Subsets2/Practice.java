package Leetcode.Medium._90.Subsets2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
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
        Practice instance = new Practice();
        List<List<Integer>> subsets = instance.subsets(nums);
        System.out.println("Subsets: " +subsets);
    }
}
