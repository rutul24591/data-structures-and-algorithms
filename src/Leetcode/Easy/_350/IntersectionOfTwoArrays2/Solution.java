package Leetcode.Easy._350.IntersectionOfTwoArrays2;
/*
        @author : Rutul Amin
        @tag: Arrays, Top Interview Question, HashMap
        @date: 15 July 2022

        350. Intersection of Two Arrays II

        Given two integer arrays nums1 and nums2, return an array of their intersection.
        Each element in the result must appear as many times as it shows in both arrays
        and you may return the result in any order.

        Example 1:
            Input: nums1 = [1,2,2,1], nums2 = [2,2]
            Output: [2,2]

        Example 2:
            Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
            Output: [4,9]
            Explanation: [9,4] is also accepted.

        Constraints:
            1 <= nums1.length, nums2.length <= 1000
            0 <= nums1[i], nums2[i] <= 1000

        Follow up:
            What if the given array is already sorted? How would you optimize your algorithm?
            What if nums1's size is small compared to nums2's size? Which algorithm is better?
            What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

        Submission Details:
            Runtime: 3 ms, faster than 85.65% of Java online submissions for Intersection of Two Arrays II.
            Memory Usage: 44.4 MB, less than 17.76% of Java online submissions for Intersection of Two Arrays II.

        Time: O(M + N), where M <= 1000 is length of nums1 array, N <= 1000 is length of nums2 array.
        Space: O(min(M, N))
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n1 : nums1) {
            if(map.containsKey(n1)) {
                map.put(n1, map.get(n1) + 1);
            }else{
                map.put(n1, 1);
            }
        }

        /*
            Runtime: 7 ms, faster than 25.28% of Java online submissions for Intersection of Two Arrays II.
            Memory Usage: 44.6 MB, less than 13.21% of Java online submissions for Intersection of Two Arrays II.

            for (int n2 : nums2) {
                if (map.containsKey(n2) && map.get(n2) > 0) {
                    list.add(n2);
                    map.put(n2, map.get(n2) - 1);
                }
            }
        */

        /*
            Runtime: 3 ms, faster than 85.65% of Java online submissions for Intersection of Two Arrays II.
            Memory Usage: 44.4 MB, less than 17.76% of Java online submissions for Intersection of Two Arrays II.
        */
        for (int n2 : nums2) {
            if (map.containsKey(n2)) {
                if(map.get(n2) > 0) {
                    list.add(n2);
                    map.put(n2, map.get(n2) - 1);
                }
            }
        }

        int[] ans = new int[list.size()];
        int i = 0;
        for (int ele : list) {
            ans[i++] = ele;
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {1,4,5,5,6,7,8};
        int[] nums2 = {1,4,6,7,9,10,11};
        Solution instance = new Solution();
        int[] result = instance.intersect(nums, nums2);
        System.out.println("Result: "+ Arrays.toString(result));
    }
}
