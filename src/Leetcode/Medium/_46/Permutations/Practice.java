package Leetcode.Medium._46.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Practice {
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
