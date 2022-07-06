package Leetcode.Easy._94.BinaryTreeInorderTraversal;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
         @author: Rutul Amin
         @tag: Binary Tree
         @date: July 6, 2022

         94. Binary Tree Inorder Traversal
             Given the root of a binary tree, return the inorder traversal of its nodes' values.

             Example 1:
                 Input: root = [1,null,2,3]
                 Output: [1,3,2]

             Example 2:
                 Input: root = []
                 Output: []

             Example 3:
                 Input: root = [1]
                 Output: [1]

             Constraints:
                 The number of nodes in the tree is in the range [0, 100].
                 -100 <= Node.val <= 100

             Note: Recursive solution is trivial, could you do it iteratively?

             Submission Details
                 Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
                 Memory Usage: 41.9 MB, less than 70.22% of Java online submissions for Binary Tree Inorder Traversal.

             Time : O(n);
                Because Recursive function is T(n) = 2 * T(n/2) + 1.

             Space: O(n)
                Worst case space required is O(n) and average is O(log n), where n is no. of nodes.

 */

public class BinaryTreeInorderTraversal {
    List<Integer> result = new ArrayList<>();

    /* Recursive Approach*/
    public List<Integer> inOrderTraversal(TreeNode root){
        inorder(root);
        return result;
    }

    private void inorder(TreeNode root) {
        inorder(root.left);
        result.add(root.data);
        inorder(root.right);
    }

    /* Iterative Approach
    *   Time: 0(n)
    *   Space: 0(n)
    *
    *   Approach:
    *   Take an arrayList to return result and stack to track traversing.
    *   Take a current variable of type TreeNode, which will be used in traversing and assign it to root
    *   Traverse until current is not null or stack is not empty.
    *   Traverse Left until node is null. When such scenario is encountered pop from stack(assign this to current)
    *   and add it to result. Finally, Traverse right by assigning current to right of popped node.
    */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        /* Take a current variable of type TreeNode, which will be used in traversing and assign it to root */
        TreeNode current = root;

        /* Traverse until current is not null or stack is not empty */
        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.data);
            current = current.right;
        }

        return result;
    }
}


