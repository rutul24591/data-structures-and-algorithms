package Leetcode.Medium._2AddTwoNumbers;

import common.ListNode;

public class Practice {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int carry = 0;

        while(l1 != null || l2 != null || carry > 0){
            int sum = 0;
            if(l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }
            sum = sum + carry;
            carry = sum / 10;   //0
            ListNode node = new ListNode(sum % 10);
            current.next = node;
            current = current.next;

        }

        return result.next;
    }
}
