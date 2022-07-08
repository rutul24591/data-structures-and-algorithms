package Leetcode.Easy._104.MaximumDepthOfBinaryTree;

import common.TreeNode;

/*
        @author: Rutul Amin
        @tag: Binary Tree
        @date: 8th July 2022

        104. Maximum Depth of Binary Tree

        Given the root of a binary tree, return its maximum depth.
        A binary tree's maximum depth is the number of nodes along the longest path from the root node down
        to the farthest leaf node.

            Example 1:
                Input: root = [3,9,20,null,null,15,7]
                Output: 3

            Example 2:
                Input: root = [1,null,2]
                Output: 2

            Constraints:
                The number of nodes in the tree is in the range [0, 104].
                -100 <= Node.val <= 100

            Submission Details:
                Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
                Memory Usage: 43.5 MB, less than 27.15% of Java online submissions for Maximum Depth of Binary Tree.
* */

public class Solution {
    public int maxDepth(TreeNode root) {
        // Base Condition
        if(root == null) return 0;

        // Hypothesis
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        // Induction
        return Math.max(left, right) + 1;
    }
}
