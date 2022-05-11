package DataStructuresAndAlgorithms.StacksWithArray;

public class IntegerStack {
    private int[] stack;
    private int top;
    private int size;

    // Constructor 1
    public IntegerStack(){
        top = -1;
        size = 50;
        stack = new int[50];
    }

    // Constructor 2
    public IntegerStack(int size){
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    public int top(){
        return top;
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == stack.length - 1;
    }

    public boolean push(int data){
        if(!isFull()){
//            System.out.println("Stack is not filled up");
            top++;
            stack[top] = data;
            return true;
        }else{
            System.out.println("Stack is filled up");
            return false;
        }
    }

    public int peek(){
        return stack[top];
    }

    public int pop(){
        return stack[top--];
    }

}
