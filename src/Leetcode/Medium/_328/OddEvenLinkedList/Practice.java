package Leetcode.Medium._328.OddEvenLinkedList;

import common.ListNode;

public class Practice {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode link = even;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = link;
        return head;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,};
        ListNode list = ListNode.constructLinkedList(nums);
        ListNode result = new Solution().oddEvenList(list);
        System.out.println("Result: " + ListNode.toString(result));
    }
}
