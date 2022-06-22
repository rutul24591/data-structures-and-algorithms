package DataStructuresAndAlgorithms.Stacks.StacksWithArray;

public class Main {
    public static void main(String[] args){
        IntegerStack stack = new IntegerStack(50);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Peek into stack: " + stack.peek());

        System.out.println("Stack Size is: " + stack.size());

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
        System.out.println("What is the top of stack? " + stack.top());

        System.out.println("Popping from stack........." +stack.pop());

        System.out.println("Stack Size is: " + stack.size());
        System.out.println("What is the top of stack? " + stack.top());
    }
}