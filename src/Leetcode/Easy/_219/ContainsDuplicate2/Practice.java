package Leetcode.Easy._219.ContainsDuplicate2;

import java.util.HashMap;
import java.util.Map;

public class Practice {
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
        Practice instance = new Practice();
        boolean result = instance.containsNearbyDuplicate(nums, k);
        System.out.println("Result: " +result);
    }
}
