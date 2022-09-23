package Leetcode.Easy._876.MiddleOfLinkedList;

import common.ListNode;

public class Practice {
    ListNode head;

    public ListNode middleNode(){
        ListNode fast = head;
        ListNode slow = head;

        if(head.next==null) {
            return head;
        }

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle: " +slow.val);
        return slow;
    }

    public void addNodeAtEnd(int data){
        ListNode node = new ListNode(0);
        node.val = data;
        node.next = null;

        // Check if it is the first element in the list or not.
        // If First then, assign node to head, as first node is always the head in the linked list.
        // Else Second then,
        if(head == null){
            head = node;
        }else{
            // We need to insert data at the end, so we need to know which is the last element in the list.
            // For this we create a new node `n` which will be used for traversing to last element
            // starting from the first(which is the head)
            ListNode n = head;

            // traverse the list until we reach the end(last element)
            while(n.next != null){
                n = n.next;
            }

            // When last element is found we add the newly created `node` to the list
            n.next = node;
        }
    }

    public void display(){
        // To display the contents of entire linked list,
        // we need to traverse the same way as we did in addNode method and simply print out the `data` of the nodes in the list
        ListNode n = head;

        while(n.next != null){
            System.out.println(n.val);
            n = n.next;
        }

        System.out.println(n.val);
    }

    public static void main(String[] args){
        MiddleOfLinkedList list = new MiddleOfLinkedList();

        list.addNodeAtEnd(1);
        list.addNodeAtEnd(2);
        list.addNodeAtEnd(3);
        list.addNodeAtEnd(4);
        list.addNodeAtEnd(5);
        list.addNodeAtEnd(6);

        list.display();

        list.middleNode();

    }
}
