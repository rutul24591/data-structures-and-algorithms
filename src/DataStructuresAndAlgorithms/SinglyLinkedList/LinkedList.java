package DataStructuresAndAlgorithms.SinglyLinkedList;

public class LinkedList {
    // By default, head is null as we have not assigned it to anything
    Node head;
    private int length;

    public LinkedList(){
        length = 0;
    }
    public void addNodeAtEnd(int data){
        Node node = new Node();
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
            Node n = head;

            // traverse the list until we reach the end(last element)
            while(n.next != null){
                n = n.next;
            }

            // When last element is found we add the newly created `node` to the list
            n.next = node;
        }
    }

    public void addNodeAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void addNodeAtPosition(int position, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;  // it's fine if we skip this line

        if(position == 0) {
            addNodeAtStart(data);
        } else {
            Node n = head;

            for (int i = 0; i < position - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    /* Delete node at a specific given position. */
    public void deleteAt(int position){
        if(position == 0){
            head = head.next;
        }else{
            /* Node which will hold the nth - 1, as we need to connect nth - 1 to nth + 1. */
            Node node = head;

            /* Iterate the list until nth - 1 is reached(where n is the index of the node to be deleted */
            for(int i = 0; i < position - 1; i++){
                node = node.next;
            }

            /* Temp node which will hold the nth node that is to be deleted */
            Node n1 = node.next;
            node.next = n1.next;
            System.out.println("Node Deleted:" +n1.data);   // Print out the data of the node to be deleted
            n1 = null;      // After changing reference, we also need to actually delete the node
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
        // To display the contents of entire linked list,
        // we need to traverse the same way as we did in addNode method and simply print out the `data` of the nodes in the list
        Node n = head;

        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }

        System.out.println(n.data);
    }
}
