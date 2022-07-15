package Leetcode.Hard._42.TrappingRainWater;

/*
        @author: Rutul Amin
        @tag: Arrays, Top Interview questions
        @date: 15 July 2022

        42. Trapping Rain Water

        Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

        Example 1:
            Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
            Output: 6
            Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
            In this case, 6 units of rain water (blue section) are being trapped.

        Example 2:
            Input: height = [4,2,0,3,2,5]
            Output: 9

        Constraints:
            n == height.length
            1 <= n <= 2 * 104
            0 <= height[i] <= 105

        Submission Details(Approach 1):
            Runtime: 2 ms, faster than 57.61% of Java online submissions for Trapping Rain Water.
            Memory Usage: 48.7 MB, less than 50.61% of Java online submissions for Trapping Rain Water.

        Time: O(n)  // Only looped once.
        Space: O(1) // No extra space required
*/
public class Solution {

    /* Approach 1 */
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int left_barr = 0, right_barr = 0;
        int result = 0;

        /* Traverse the height array */
        while(left <= right){
            if(left_barr <= right_barr){
                if(height[left] > left_barr){
                    left_barr = height[left];
                }else{
                    result = result + left_barr - height[left];
                }
                left ++;
            }else{
                if(height[right] > right_barr){
                    right_barr = height[right];
                }else{
                    result = result + right_barr - height[right];
                }
                right --;
            }
        }
        return result;
    }

    /* Approach 2(Doesn't work on Leetcode for extreme cases
         Time: O(n^2) Since Computing leftMax and rightMax in each pass takes O(n).
         Space: O(1)
    */
    public int trap2(int[] height){
        /* To store the maximum water that can be stored */
        int totalWater = 0;
        int n = height.length;
        /* Loop the height array ignoring first and last element */
        for(int k = 0; k < n; ++k){
            int leftMax = 0;
            /*
                Find the maximum element on its left.
                Traverse the height array from start to current index and find the maximum height.
            */
            for(int i = 0; i <= k - 1; ++i){
                leftMax = Math.max(leftMax, height[i]);
            }
            int rightMax = 0;
            /*
                Find the maximum element on its right.
                Traverse the height array from current index to end and find the maximum height.
            */
            for(int i = k + 1; i < n; ++i){
                rightMax = Math.max(rightMax, height[i]);
            }
            /*
                Update maximum water value.
                The amount of water that will be stored in this column(or index) is minimum height of left or right minus
                the height of current index.

                    min(left, right) - height[i]
            */
            int water = Math.min(leftMax, rightMax) - height[k];
            totalWater += (water > 0) ? water : 0;
        }
        return totalWater;
    }

    public static void main(String[] args){
        int[] nums = {4,2,0,3,2,5};
        Solution instance = new Solution();
        int result1 = instance.trap(nums);
        int result2 = instance.trap2(nums);
        System.out.println("Result 1: "+result1);
        System.out.println("Result 2: "+result2);
    }
}
