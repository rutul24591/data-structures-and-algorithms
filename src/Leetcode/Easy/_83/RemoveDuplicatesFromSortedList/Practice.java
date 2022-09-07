package Leetcode.Easy._83.RemoveDuplicatesFromSortedList;

import common.ListNode;

public class Practice {
    public ListNode deleteDuplicates(ListNode head) {
        // if no elements or just a single element, then return head itself.
        if(head == null || head.next == null){
            return head;
        }

        // Dummy node that points to head.
        ListNode start = new ListNode(0);
        start.next = head;

        // Node to be used for traversing
        ListNode node = head;

        // While node itself is not null
        while(node != null){
            // Check if node.next exists and compare value of current node with val of next node.
            // If value is same, then we simply connect the current node to node.next.next;
            // In case of second to last element, node.next.next will be null.
            if(node.next != null && node.val == node.next.val){
                node.next = node.next.next;
            }else{
                // Simply move the node to next one
                node = node.next;
            }
        }

        // Return the next of dummy node
        return start.next;
    }

    public static void main(String[] args){
        // Remember the list to pull out duplicates is `sorted`.
        int[] nums = {1,1,2,3,3,4,5,5};
        ListNode l1 = ListNode.constructLinkedList(nums);

        System.out.println("l1: " +l1);
        RemoveDuplicatesFromSortedList instance = new RemoveDuplicatesFromSortedList();

        ListNode result = instance.deleteDuplicates(l1);

        System.out.println("NEW LIST: " +result);

    }
}
