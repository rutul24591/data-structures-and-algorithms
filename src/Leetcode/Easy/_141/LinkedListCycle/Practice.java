package Leetcode.Easy._141.LinkedListCycle;

import common.ListNode;

public class Practice {
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
