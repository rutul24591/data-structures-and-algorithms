package Leetcode.Medium._102.BinaryTreeLevelOrderTraversal;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
        @author: Rutul Amin
        @tag: Binary Tree, ArrayList, Top Interview questions
        @date: 15 July 2022

        102. Binary Tree Level Order Traversal

        Given the root of a binary tree, return the level order traversal of its nodes' values.
        (i.e., from left to right, level by level).

        Example 1:
            Input: root = [3,9,20,null,null,15,7]
            Output: [[3],[9,20],[15,7]]

        Example 2:
            Input: root = [1]
            Output: [[1]]

        Example 3:
            Input: root = []
            Output: []

        Constraints:
            The number of nodes in the tree is in the range [0, 2000].
            -1000 <= Node.val <= 1000

        Submission Details:
            Runtime: 1 ms, faster than 92.53% of Java online submissions for Binary Tree Level Order Traversal.
            Memory Usage: 43.7 MB, less than 33.89% of Java online submissions for Binary Tree Level Order Traversal.

        Time : O(N);
        Space: O(N);
*/
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();

        helper(root,0,levels);
        return levels;
    }

    public void helper(TreeNode root, int level,List<List<Integer>> levels){
        if(root == null) return;

        if(level == levels.size()){
            List<Integer> temp = new ArrayList<>();
            temp.add(root.data);
            levels.add(temp);
        }else{
            levels.get(level).add(root.data);
        }

        helper(root.left, level+1, levels);
        helper(root.right, level+1, levels);
    }
}
