package Leetcode.Easy._141.LinkedListCycle;

import common.ListNode;

/**
        141. Linked List Cycle

                Given head, the head of a linked list, determine if the linked list has a cycle in it.

                There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
                Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
                Note that pos is not passed as a parameter.

                Return true if there is a cycle in the linked list. Otherwise, return false.



                Example 1:
                     Input: head = [3,2,0,-4], pos = 1
                     Output: true
                     Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

                Example 2:
                     Input: head = [1,2], pos = 0
                     Output: true
                     Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

                Example 3:
                     Input: head = [1], pos = -1
                     Output: false
                     Explanation: There is no cycle in the linked list.


                Constraints:
                     The number of the nodes in the list is in the range [0, 104].
                     -105 <= Node.val <= 105
                     pos is -1 or a valid index in the linked-list.

                Submission Details:
                     Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
                     Memory Usage: 45.8 MB, less than 57.43% of Java online submissions for Linked List Cycle.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        //Both the pointers will be initially points towards head
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            if(fast == slow || fast.next == slow){
                return true;
            }
            //If the fastPointer reaches null or if its next is pointing to null, then we break the loop
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
