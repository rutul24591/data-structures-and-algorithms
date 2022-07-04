package DataStructuresAndAlgorithms.LinkedList.DoublyLinkedList;

public class LinkedList {
    Node head;
    private int length;

    public LinkedList(){
        length = 0;
    }

    public void addNodeAtEnd(int data){
        Node node = new Node();
        node.data = data;
        node.prev = null;
        node.next = null;

        // Check if the element to be inserted is the first element in the list
        if(head == null){
            head = node;
        } else {
            Node n = head;

            //Traverse the list until last element is reached
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
            node.prev = n;
        }
    }

    public void addNodeAtStart(int data){
        Node node = new Node();     // Create a new node
        node.data = data;           // Assign data to newly created node
        node.next = head;           // Make the next of new `node` point to the head (which currently is the first element)
        node.prev = null;           // Make the prev of new `node` point to null (which will be our first node after this functions ends)
        head.prev = node;           // Important: Make the prev of head point towards out new `node` (Head is now second element.)
        head = node;                // Make the new `node` the head (Now our new `node` is the head.)
    }

    public void addNodeAtPosition(int position, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.prev = null;

        if(position == 0){
            addNodeAtStart(data);
        }else{
            Node n = head;

            // As far I don't know if we use some other way, so create a new Node variable (nPlusOneNode) to tract nth+1 node.
            // Not the case in singly linked list as we do not have to track prev.
            Node nPlusOneNode;
            // Traverse
            for(int i = 0; i < position - 1; i++){
                n = n.next;
            }
            nPlusOneNode = n.next;
            node.next = nPlusOneNode; // can also say n.next.
            node.prev = n;
            n.next = node;
            nPlusOneNode.prev = node;
        }
    }

    /* Delete node at a specific given position. */
    public void deleteAt(int position){
         if(position == 0){
             Node n = head;         // We take n as head simply because we want to delete the node from memory.
             Node n1 = head.next;
             n1.prev = null;
             n = null;              // Make the n node reference to null to remove from memory.
             head = n1;

             /*
             *  NOTE: If no memory constraints, then this could be done like this
             *          Node n = head.next;
             *          n.prev = null;
             *          head = n
             * */
         } else {
             Node n = head;
             Node n1, n2;       // n1 will the node which we want to delete and n2 will be the next node of n1(we have to change the prev of n2 to point to n)
             // Traverse n to n1 - 1 position
             for(int i = 0; i < position - 1; i++){
                n = n.next;
             }
             n1 = n.next;       // This is node we want to delete
             n2 = n1.next;      // This is the node which is next to the node(which is to be deleted)
             n2.prev = n;       // Make n2 to point to previous node which is now n.
             n.next = n2;       // Make n point to next node which is now n2.

             // Print out the data of the node to be deleted
             System.out.println("Node Deleted:" +n1.data);

             // After changing reference, we also need to actually delete the node
             n1 = null;
         }
    }

    public void getLengthOfList(){
        Node n = head;
        while(n.next != null){
            n = n.next;
            length++;
        }
        // Remember we are traversing until nth-1 position, so we need to increase the length by 1 to count the last element
        length = length + 1;
        System.out.println("Length of the list:" +length);
    }

    public void display(){
        Node n = head;
        while(n.next != null){
            System.out.println("Node Data:" +n.data);
//            System.out.println("Node Next:" +n.next);
//            System.out.println("Node Prev:" +n.prev);
            n = n.next;
        }
        // Without this line the last elements' data won't be printed, as loop runs until the second last element
        System.out.println("Node Data:" +n.data);
//        System.out.println("Node Next:" +n.next);
//        System.out.println("Node Prev:" +n.prev);
    }
}
