package Leetcode.Medium._287.FindTheDuplicateNumber;

import java.util.Arrays;
import java.util.HashSet;

/*
        287. Find the Duplicate Number

        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
        There is only one repeated number in nums, return this repeated number.

        You must solve the problem without modifying the array nums and uses only constant extra space.

        Example 1:
            Input: nums = [1,3,4,2,2]
            Output: 2

        Example 2:
            Input: nums = [3,1,3,4,2]
            Output: 3

        Constraints:
            1 <= n <= 105
            nums.length == n + 1
            1 <= nums[i] <= n
            All the integers in nums appear only once except for precisely one integer which appears two or more times.

        Follow up:
            How can we prove that at least one duplicate number must exist in nums?
            Can you solve the problem in linear runtime complexity?
*/
public class Solution {
    /*  This solves the problem but obey constraints of the problem.
        We take extra space using hash set here. So no constant space.
    */
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return i;
            }else{
                set.add(i);
            }
        }
        return -1;
    }

    /*  In an unsorted array, duplicate elements may be scattered across the array.
        However, in a sorted array, duplicate numbers will be next to each other.

        Algorithm:

        1. Sort the nums array.
        2. Iterate through the array, comparing the current number to the previous number(compare nums[i] to nums[i-1]
        where i > 0.
        3. Return the first number that is equal to its predecessor.

        Time: O(n logn)
            Sorting takes O(n logn). THis is followed by linear scan, resulting in a total of O(n logn) + O(n) = O(n logn)
            time.
        Space: O(logn) or O(n)
            Space is language dependent.
            Java: Arrays.sort() for primitives is implemented using variant of quick sort, which has space complexity of
                  O(logn)
            Python: O(n), using Timesort algorithm which has worst case of O(n).

    */
    public int findDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1])
                return nums[i];
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,4,5,3,7,3};
        Solution instance = new Solution();
        int result = instance.findDuplicate2(nums);
        System.out.println("Result: "+result);
    }
}
