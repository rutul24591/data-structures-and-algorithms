package DataStructuresAndAlgorithms.Queues;

/*
    QUEUES:
         A queue is a useful data structure in programming.
         It is similar to the ticket queue outside a cinema hall,
         where the first person entering the queue is the first person who gets the ticket.

         Queue follows the First In First Out (FIFO) rule - the item that goes in first is the item that comes out first.

         In programming terms, putting items in the queue is called enqueue,
         and removing items from the queue is called dequeue.

         Basic Operations of Queue
            A queue is an object (an abstract data structure - ADT) that allows the following operations:

            Enqueue: Add an element to the end of the queue
            Dequeue: Remove an element from the front of the queue
            IsEmpty: Check if the queue is empty
            IsFull: Check if the queue is full
            Peek: Get the value of the front of the queue without removing it

         Working of Queue
            Queue operations work as follows:
                Two pointers FRONT and REAR
                FRONT track the first element of the queue
                REAR track the last element of the queue
                initially, set value of FRONT and REAR to -1

        Enqueue Operation
            Check if the queue is full
            for the first element, set the value of FRONT to 0
            increase the REAR index by 1
            add the new element in the position pointed to by REAR

        Dequeue Operation
            Check if the queue is empty
            return the value pointed by FRONT
            increase the FRONT index by 1
            for the last element, reset the values of FRONT and REAR to -1

        Complexity Analysis
            The complexity of enqueue and dequeue operations in a queue using an array is O(1).
            If you use pop(N) in python code,
            then the complexity might be O(n) depending on the position of the item to be popped.

        Applications of Queue
            1. CPU scheduling, Disk Scheduling
            2. When data is transferred asynchronously between two processes.
               The queue is used for synchronization. For example: IO Buffers, pipes, file IO, etc
            3. Handling of interrupts in real-time systems.
            4. Call Center phone systems use Queues to hold people calling them in order.

*/
public class IntegerQueue {
    int size = 5;
    int[] items = new int[size];
    int front, rear;

    //Constructor
    IntegerQueue(){
        front = -1;
        rear = -1;
    }

    private boolean isFull() {
        // For cleanup we can `return` just `front == 0 && rear == size - 1`
        if(front == 0 && rear == size - 1){
            return true;
        }else {
            return false;
        }
    }

    private boolean isEmpty() {
        // For cleanup we can `return` just `front == -1`
        if(front == -1){
            return true;
        }else{
            return false;
        }
    }

    public void enQueue(int element) {
        if(isFull()) {
            System.out.println("Queue is Full");
        } else {
            if(front == -1){
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Element " +element+ " inserted at " +rear);
        }
    }

    public int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return (-1);
        } else {
            int element = items[front];
            /* Queue has only one element, so we reset the queue after deleting it. */
            if(front >= rear){
                front = -1;
                rear = -1;
            }else {
                front++;
            }
            System.out.println("\n Removed Element -> " + element);
            return element;
        }
    }

    public void display() {
        if(isEmpty()){
            System.out.println("Empty Queue");
        }else{
            System.out.println("\n FRONT Index -> " +front);
            System.out.println(":::::::::::::::ITEMS:::::::::::::::: ");
            for(int iterator = front; iterator <= rear; iterator++){
                System.out.println(items[iterator] + " ");
            }
            System.out.println("\n REAR Index -> " + rear);
        }
    }

    public static void main(String[] args) {
        IntegerQueue q = new IntegerQueue();

        // deQueue is not possible on empty queue
        q.deQueue();

        // enQueue 5 elements
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // 6th element can't be added to because the queue is full
        q.enQueue(6);

        q.display();

        // deQueue removes element entered first i.e. 1
        q.deQueue();

        // Now we have just 4 elements
        q.display();
    }
}
