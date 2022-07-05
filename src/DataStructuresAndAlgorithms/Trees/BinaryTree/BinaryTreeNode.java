package DataStructuresAndAlgorithms.Trees.BinaryTree;

public class BinaryTreeNode {
    /*
        For the sake of simplicity, for now we are setting the public access modifier to all variables instead of
        encapsulating and providing getters and setters.
    */
    public int data;
    public BinaryTreeNode leftChild;
    public BinaryTreeNode rightChild;

    public BinaryTreeNode (int data){
        this.data = data;
    }

    public String toString() {
        return "data: " +data;
    }

}
