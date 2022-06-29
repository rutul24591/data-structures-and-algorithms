package Leetcode.Easy._206.ReverseLinkedList;

import common.ListNode;

/**
         @author : Rutul Amin
         @date: 29th June 2022
         @tag: Singly linked list, Top 100 interview questions.

        206. Reverse Linked List

        Given the head of a singly linked list, reverse the list, and return the reversed list.

         Example 1:
             Input: head = [1,2,3,4,5]
             Output: [5,4,3,2,1]

         Example 2:
             Input: head = [1,2]
             Output: [2,1]

         Example 3:
             Input: head = []
             Output: []


         Constraints:
             The number of nodes in the list is the range [0, 5000].
             -5000 <= Node.val <= 5000

         Submission details(Iterative approach):
             Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
             Memory Usage: 43.1 MB, less than 41.73% of Java online submissions for Reverse Linked List.

             Time: O(N); Space : O(1)

         Submission Details(Recursive approach):
            Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
            Memory Usage: 43 MB, less than 49.65% of Java online submissions for Reverse Linked List.

 */
public class ReversedLinkedList {
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head; //null
        }
        ListNode current = head;
        ListNode previous = null;

        while(current != null){
            ListNode temp;
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        // At this stage prev would be the last node.
        return previous;
    }

    /* Recursive Approach */
    public ListNode reverseListRecursive(ListNode head){
        if(head == null || head.next == null){
            return head; //null
        }

        ListNode temp = head.next;
        ListNode rHead = reverseListRecursive(temp);    // By recursion this will bring 5 always
        temp.next = head;
        head.next = null;
        return rHead;
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3,4,5};
        ListNode node1 = ListNode.constructLinkedList(nums1);
        int[] nums2 = {6,7,8,9,10};
        ListNode node2 = ListNode.constructLinkedList(nums2);
        /*  1 -> 2 -> 3 -> 4 -> 5 -> null */
        /*  6 -> 7 -> 8 -> 9 -> 10 -> null */
        ListNode resultIterative = new ReversedLinkedList().reverseList(node1);
        System.out.println("Result Iterative: " + ListNode.toString(resultIterative));
        ListNode resultRecursive = new ReversedLinkedList().reverseListRecursive(node2);
        System.out.println("Result Recursive: " + ListNode.toString(resultRecursive));
    }
}
