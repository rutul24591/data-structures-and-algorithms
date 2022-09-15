package Leetcode.Easy._347.TopKFrequentElements;

import java.util.*;

public class Practice {
    public int[] FindKFrequentElements(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.replace(num, map.get(num) + 1);
            }
        }

        /* Map values cannot be directly sorted, but this functionality can be achieved by creating a List with map.entrySet */
        /* Putting the map in a list */
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());

        /* Sort the list on basis of the values */
        entries.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        for(int i = 0; i < k; i++){
            result[i] = entries.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3,};
        int k = 2;
        Practice instance = new Practice();
        int[] result;
        result = instance.FindKFrequentElements(nums, k);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
