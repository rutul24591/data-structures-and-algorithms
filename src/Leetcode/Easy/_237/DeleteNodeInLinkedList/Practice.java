package Leetcode.Easy._237.DeleteNodeInLinkedList;

import common.ListNode;

public class Practice {
    public void deleteNode(ListNode node) {
        /* Approach

          1. Copy the node.next into temp variable.
          2. Simply change the value of `node` to temp.val(next one)
          3. Then change next pointer of `node`, which will point to temp.next
         */

        ListNode temp = node.next;
        node.val = temp.val;

        node.next = temp.next;
    }
}
