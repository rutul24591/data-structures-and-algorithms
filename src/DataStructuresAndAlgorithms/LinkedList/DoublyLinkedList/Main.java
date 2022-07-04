package DataStructuresAndAlgorithms.LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();

        System.out.println("===============Add and display new Nodes==================");

        linkedList.addNodeAtEnd(1);
        linkedList.addNodeAtEnd(2);
        linkedList.addNodeAtEnd(3);
        linkedList.addNodeAtEnd(4);
        linkedList.addNodeAtEnd(5);

        linkedList.display();

        System.out.println("================ Display the length of list ==================");

        linkedList.getLengthOfList();

        System.out.println("=============== Add a node at start position and display new list ===================");

        linkedList.addNodeAtStart(6);

        linkedList.display();

        System.out.println("================ Add a node at position 3 and display new list ==================");

        linkedList.addNodeAtPosition(3, 1000);

        linkedList.display();

        System.out.println("=============== Delete a node at start and display the new list ===================");

        linkedList.deleteAt(0);

        linkedList.display();

        System.out.println("================Delete the node at position 3 and display the new list ==================");

        linkedList.deleteAt(3);

        linkedList.display();
    }
}
