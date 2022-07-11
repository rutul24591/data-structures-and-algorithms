package Leetcode.Medium._328.OddEvenLinkedList;

import common.ListNode;

/*
        @author: Rutul Amin
        @tag: Linked List, Top Interview questions
        @date: 11th July 2022

        328. Odd Even Linked List

        Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
        The first node is considered odd, and the second node is even, and so on.

        Note that the relative order inside both the even and odd groups should remain as it was in the input.

        You must solve the problem in O(1) extra space complexity and O(n) time complexity.

        Example 1:
            Input: head = [1,2,3,4,5]
            Output: [1,3,5,2,4]

        Example 2:
            Input: head = [2,1,3,5,6,4,7]
            Output: [2,3,6,7,1,5,4]

        Constraints:
            The number of nodes in the linked list is in the range [0, 104].
            -106 <= Node.val <= 106

        Submission Details:
            Runtime: 1 ms, faster than 35.57% of Java online submissions for Odd Even Linked List.
            Memory Usage: 44.3 MB, less than 72.38% of Java online submissions for Odd Even Linked List.

        Time: 0(n)  n is the length of the list
        Space: 0(1) no auxiliary space used.
*/

public class Solution {
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
