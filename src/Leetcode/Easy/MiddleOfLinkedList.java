package Leetcode.Easy;

/*
        Given the head of a singly linked list, return the middle node of the linked list.

        If there are two middle nodes, return the second middle node.

        Example 1:


        Input: head = [1,2,3,4,5]
        Output: [3,4,5]
        Explanation: The middle node of the list is node 3.
        Example 2:


        Input: head = [1,2,3,4,5,6]
        Output: [4,5,6]
        Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.


        Constraints:

        The number of nodes in the list is in the range [1, 100].
        1 <= Node.val <= 100

*/

/**
 * Definition for singly-linked list.
 * */
     class ListNode {
        int data;
        ListNode next;
        ListNode() {}
        ListNode(int data) { this.data = data; }
        ListNode(int data, ListNode next) { this.data = data; this.next = next; }
    }


    public class MiddleOfLinkedList {
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
            System.out.println("Middle: " +slow.data);
            return slow;
        }

        public void addNodeAtEnd(int data){
            ListNode node = new ListNode();
            node.data = data;
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
                System.out.println(n.data);
                n = n.next;
            }

            System.out.println(n.data);
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
