package Leetcode.Easy._100.IsSameTree;

import common.TreeNode;

/*
        @author: Rutul Amin
        @tag: Binary Tree
        @date: 17th July 2022

        100. Same Tree
        Given the roots of two binary trees p and q, write a function to check if they are the same or not.

        Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

        Example 1:
            Input: p = [1,2,3], q = [1,2,3]
            Output: true

        Example 2:
            Input: p = [1,2], q = [1,null,2]
            Output: false

        Example 3:
            Input: p = [1,2,1], q = [1,1,2]
            Output: false

        Constraints:
            The number of nodes in both trees is in the range [0, 100].
            -104 <= Node.val <= 104

        Submission Details:
            Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
            Memory Usage: 41.9 MB, less than 20.78% of Java online submissions for Same Tree.

        Time: O(n) , where O(n) is the no. of nodes in the tree, since one visits each node exactly once.
        Space: O(n) in the worst case of completely unbalanced tree, to keep a recursion stack.

        Note: Other approach is doing iteratively.

*/
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // p and q are both null
        if (p == null && q == null) return true;

        // one of p and q is null
        if (q == null || p == null) return false;

        if (p.data != q.data) return false;

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
