package DataStructuresAndAlgorithms.SinglyLinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.addNodeAtEnd(1);
        list.addNodeAtEnd(2);
        list.addNodeAtEnd(3);
        list.addNodeAtEnd(4);
        list.addNodeAtEnd(5);

        list.addNodeAtStart(24);

        list.getLengthOfList();

        list.addNodeAtPosition(2, 1000);

        list.deleteAt(2);

        list.display();
    }
}
