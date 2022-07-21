package Leetcode.Medium._230.KthSmallestElementInBST;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
        @author: Rutul Amin
        @tag: ArrayList, BST, Recursion
        @date: 21st July 2022

        230. Kth Smallest Element in a BST

        Given the root of a binary search tree, and an integer k,
        return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

        Example 1:
            Input: root = [3,1,4,null,2], k = 1
            Output: 1

        Example 2:
            Input: root = [5,3,6,2,4,null,null,1], k = 3
            Output: 3

        Constraints:
            The number of nodes in the tree is n.
            1 <= k <= n <= 104
            0 <= Node.val <= 104

        Follow up:
            If the BST is modified often (i.e., we can do insert and delete operations) and
            you need to find the kth smallest frequently, how would you optimize?

        Submission Details:
            Approach 1:
                Runtime: 2 ms, faster than 35.46% of Java online submissions for Kth Smallest Element in a BST.
                Memory Usage: 45.4 MB, less than 47.56% of Java online submissions for Kth Smallest Element in a BST.

                Time: O(n)  to build a traversal.
                Space: O(n)  to keep an inorder traversal.

*/
public class Solution {

    /* Approach 1 */
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> nums = inorderTraverse(root, new ArrayList<>());
        return nums.get(k - 1);
    }

    public ArrayList<Integer> inorderTraverse(TreeNode root, ArrayList<Integer> arr){
        if(root == null) {
            return arr;
        }
        inorderTraverse(root.left, arr);
        arr.add(root.data);
        inorderTraverse(root.right, arr);
        return arr;
    }
}
