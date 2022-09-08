package Leetcode.Easy._94.BinaryTreeInorderTraversal;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Practice {
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
