package Leetcode.Easy._2236.RootEqualsSumOfChildren;

import common.TreeNode;
/*      @author: Rutul Amin
        @tag: Binary Tree, Sum
        @Date: 6th July 2022.

        2236. Root Equals Sum of Children
        You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.
        Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.

        Example 1:
            Input: root = [10,4,6]
            Output: true
            Explanation: The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
            10 is equal to 4 + 6, so we return true.

        Example 2:
            Input: root = [5,3,1]
            Output: false
            Explanation: The values of the root, its left child, and its right child are 5, 3, and 1, respectively.
            5 is not equal to 3 + 1, so we return false.

        Submission Details:
            Runtime: 1 ms, faster than 74.80% of Java online submissions for Root Equals Sum of Children.
            Memory Usage: 42.1 MB, less than 21.97% of Java online submissions for Root Equals Sum of Children.

        Constraints:
            The tree consists only of the root, its left child, and its right child.
            -100 <= Node.val <= 100

        Time: O(1)
        Space: O(1)

* */
public class Solution {
    public boolean checkTree(TreeNode root) {
        return root.data == root.left.data + root.right.data;
    }
}
