package Leetcode.Easy._100.IsSameTree;

import common.TreeNode;

public class Practice {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // p and q are both null
        if (p == null && q == null) return true;

        // one of p and q is null
        if (q == null || p == null) return false;

        if (p.data != q.data) return false;

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
