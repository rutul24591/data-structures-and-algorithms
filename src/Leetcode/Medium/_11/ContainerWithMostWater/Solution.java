package Leetcode.Medium._11.ContainerWithMostWater;

/*
        @author: Rutul Amin
        @tag: Arrays, Top Interview questions
        @date: 18th July 2022

        11. Container With Most Water

        You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

        Find two lines that together with the x-axis form a container, such that the container contains the most water.

        Return the maximum amount of water a container can store.

        Notice that you may not slant the container.

        Example 1:
            Input: height = [1,8,6,2,5,4,8,3,7]
            Output: 49
            Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
            In this case, the max area of water (blue section) the container can contain is 49.

        Example 2:
            Input: height = [1,1]
            Output: 1

        Constraints:
            n == height.length
            2 <= n <= 105
            0 <= height[i] <= 104

        Submission Details:
            Runtime: 3 ms, faster than 97.21% of Java online submissions for Container With Most Water.
            Memory Usage: 52.5 MB, less than 92.28% of Java online submissions for Container With Most Water.

        Time: O(n)
        Space: O(1)
*/
public class Solution {
    //Brute Force Time: O(n^2) Space: O(1)
    public int maxArea(int[] height) {
        int result = 0;
        int n = height.length;
        for(int left = 0; left < n - 1; left++){
            for(int right = left + 1; right < n; right++){
                int curr_area = Math.min(height[left], height[right]) * (right - left);
                result = Math.max(result, curr_area);
            }
        }
        return result;
    }

    /* Approach 2 */
    public int maxArea2(int[] height) {
        int result = 0;
        int n = height.length;
        int left = 0, right = n-1;
        while(left < right){
            // Select the minimum of left and right pointer heights for area calculation
            int currArea = Math.min(height[left], height[right]) * (right - left);

            // Select the maximum of result so far and current area result
            result = Math.max(result, currArea);

            // If the current l height is less than r height,
            // there is no use selecting l for next iteration because, width decreases, so area cant                increase
            // So l++(select r, don't select l for next iteration)
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Solution instance = new Solution();
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int result = instance.maxArea2(nums);
        System.out.println("Result: " +result);
    }
}
