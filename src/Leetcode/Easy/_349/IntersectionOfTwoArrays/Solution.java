package Leetcode.Easy._349.IntersectionOfTwoArrays;
/*
        @author : Rutul Amin
        @tag: Arrays, Top Interview Question, HashMap
        @date: 15 July 2022

        350. Intersection of Two Arrays II

        Given two integer arrays nums1 and nums2, return an array of their intersection.
        Each element in the result must be unique and you may return the result in any order.

        Example 1:
            Input: nums1 = [1,2,2,1], nums2 = [2,2]
            Output: [2]

        Example 2:
            Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
            Output: [4,9]
            Explanation: [9,4] is also accepted.

        Constraints:
            1 <= nums1.length, nums2.length <= 1000
            0 <= nums1[i], nums2[i] <= 1000

        Submission Details:
            Approach 1
                Runtime: 5 ms, faster than 50.90% of Java online submissions for Intersection of Two Arrays.
                Memory Usage: 44.4 MB, less than 22.90% of Java online submissions for Intersection of Two Arrays.

                Time: O(M + N), where M <= 1000 is length of nums1 array, N <= 1000 is length of nums2 array.
                Space: O(min(M, N))

            Approach 2:
                Runtime: 5 ms, faster than 50.90% of Java online submissions for Intersection of Two Arrays.
                Memory Usage: 43.5 MB, less than 77.89% of Java online submissions for Intersection of Two Arrays.

                Time: O(M + N), where M <= 1000 is length of nums1 array, N <= 1000 is length of nums2 array.
                Space: O(min(M, N))
*/

import java.util.*;

public class Solution {
    /* Approach 1: Using Hash map */
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n1 : nums1) {
            if(!map.containsKey(n1)){
                map.put(n1, 1);
            }
        }
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

    /* Approach 2: Using Hash set */
    public int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        List<Integer> result = new ArrayList<>();

        for (int i : nums2) {
            if(set.contains(i)){
                result.add(i);
                set.remove(i);
            }
        }

        int[] ints = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ints[i]=result.get(i);
        }
        return ints;
    }

    public static void main(String[] args){
        int[] nums = {1,4,5,5,6,7,8};
        int[] nums2 = {1,4,6,5,5,11};
        Solution instance = new Solution();
        int[] result = instance.intersection(nums, nums2);
        int[] result2 = instance.intersection2(nums, nums2);
        System.out.println("Result: "+ Arrays.toString(result));
        System.out.println("Result2: "+ Arrays.toString(result2));
    }
}
