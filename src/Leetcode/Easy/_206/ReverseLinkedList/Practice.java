package Leetcode.Easy._206.ReverseLinkedList;

import common.ListNode;

public class Practice {
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
        ListNode resultIterative = new Practice().reverseList(node1);
        System.out.println("Result Iterative: " + ListNode.toString(resultIterative));
        ListNode resultRecursive = new Practice().reverseListRecursive(node2);
        System.out.println("Result Recursive: " + ListNode.toString(resultRecursive));
    }
}
