package Leetcode.Medium._19.RemoveNthNodeFromEndOfList;

import common.ListNode;
/*
    19. Remove Nth Node From End of List (Medium)

        Given the head of a linked list, remove the nth node from the end of the list and return its head.

        Example 1:

            Input: head = [1,2,3,4,5], n = 2
            Output: [1,2,3,5]

        Example 2:

            Input: head = [1], n = 1
            Output: []

        Example 3:

            Input: head = [1,2], n = 1
            Output: [1]

        Constraints:

        The number of nodes in the list is sz.
            1 <= sz <= 30
            0 <= Node.val <= 100
            1 <= n <= sz


        Follow up: Could you do this in one pass?

        APPROACH:

        1. Take two dummy nodes, who’s next will be pointing to the head.
        2. Take another node to store the head, initially it,s a dummy node(start),
           and the next of the node will be pointing to the head.
           The reason why we are using this extra dummy node, is because there is an edge case.
           If the node is equal to the length of the linkedlist, then this slow’s will point to slow’s next→ next.
           And we can say our dummy start node will be broken, and will be connected to the slow’s next→ next.
        3. Start traversing until the fast pointer reaches the nth node.
        4. Now start traversing by one step both of the pointers until the fast pointers reach the end.
        5. When the traversal is done, just do the deleting part.
           Make  slow pointer’s next to the next of next of the slow pointer to ignore/disconnect the given node.
        6. Last, return the next of start.

        Time Complexity: O(N)
        Space Complexity: O(1)
*/
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        /* We need this dummy node `start` so our doesn't get broken */
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode fastNode = start;
        ListNode slowNode = start;

        /*Traverse till fast reaches nth node*/
        for(int i = 1; i <= n;i++){
            fastNode= fastNode.next;
        }

        while(fastNode.next != null){
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        slowNode.next = slowNode.next.next;
        return start.next;
    }


    public static void main(String[] args){
        int nthMinusLastPosition = 2;
        int[] nums1 = {1,2,3,4,5};
        ListNode node1 = ListNode.constructLinkedList(nums1);
        ListNode result = new RemoveNthNodeFromEndOfList().removeNthFromEnd(node1, nthMinusLastPosition);
        System.out.println("Result: " + ListNode.toString(result));
    }
}
