package Leetcode.Easy._347.TopKFrequentElements;

import java.util.*;

/**
        347. Top K Frequent Elements

         Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

         Example 1:
             Input: nums = [1,1,1,2,2,3], k = 2
             Output: [1,2]

         Example 2:
             Input: nums = [1], k = 1
             Output: [1]


         Constraints:
             1 <= nums.length <= 105
             k is in the range [1, the number of unique elements in the array].
             It is guaranteed that the answer is unique.


         Follow up:
             Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

         Submission Details:
             Runtime: 30 ms, faster than 13.63% of Java online submissions for Top K Frequent Elements.
             Memory Usage: 51.4 MB, less than 12.94% of Java online submissions for Top K Frequent Elements.
 */
public class TopKFrequentElements {
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
        TopKFrequentElements instance = new TopKFrequentElements();
        int[] result;
        result = instance.FindKFrequentElements(nums, k);
        System.out.println("Result: " +Arrays.toString(result));
    }
}
