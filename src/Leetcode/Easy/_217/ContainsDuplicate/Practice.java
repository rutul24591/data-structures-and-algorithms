package Leetcode.Easy._217.ContainsDuplicate;

import java.util.HashSet;

public class Practice {
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
