package Leetcode.Easy._1.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class Practice {
    public int[] twoSum(int[] array, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < array.length; i++){
            if(map.containsKey(target - array[i])){
                result[1] = i;
                result[0] = map.get(target - array[i]);
                return result;
            }else{
                map.put(array[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {2,3,7,8};
        int target = 15;
        Practice instance = new Practice();
        int[] result = instance.twoSum(nums, target);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
