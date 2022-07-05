package DataStructuresAndAlgorithms.Trees.BinaryTree;

public class BinaryTree {
    private BinaryTreeNode root;

    public void insertNode(int value) {
        /* Create a new Node and initialize it */
        BinaryTreeNode newNode = new BinaryTreeNode(value);

        /* If there is no root this becomes root */
        if(root == null){
            root = newNode;
        }else{
            /* Set root as the Node, which we will use to traverse the tree */
            BinaryTreeNode currentNode = root;

            /* Future parent node of our new node */
            BinaryTreeNode parent;

            while(true){
                parent = currentNode;
                if(value <= currentNode.data){
                    /* Switch focus to the left child */
                    currentNode = currentNode.leftChild;

                    if(currentNode == null){
                        /* Then place the new node on the left of it */
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    /* Switch focus to the right child */
                    currentNode = currentNode.rightChild;
                    if(currentNode == null){
                        /* Then place the new node on the left of it */
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void preOrderTraverseWrapper(){
        preOrderTraversal(root);
    }
    private void preOrderTraversal(BinaryTreeNode node){
        if(node != null){
            System.out.println(node);
            preOrderTraversal(node.leftChild);
            preOrderTraversal(node.rightChild);
        }
    }

    public void postOrderTraverseWrapper(){
        postOrderTraversal(root);
    }
    private void postOrderTraversal(BinaryTreeNode node){
        if(node != null){
            postOrderTraversal(node.leftChild);
            postOrderTraversal(node.rightChild);
            System.out.println(node);
        }
    }

    public void inOrderTraverseWrapper(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(BinaryTreeNode node){
        if(node != null){
            inOrderTraversal(node.leftChild);
            System.out.println(node);
            inOrderTraversal(node.rightChild);
        }
    }


    public static void main(String[] args){
        BinaryTree theTree = new BinaryTree();
        theTree.insertNode(45);
        theTree.insertNode(10);
        theTree.insertNode(7);
        theTree.insertNode(12);
        theTree.insertNode(90);
        theTree.insertNode(50);
        theTree.insertNode(60);

        System.out.println("PRE ORDER TRAVERSAL: ");
        theTree.preOrderTraverseWrapper();

        System.out.println("IN ORDER TRAVERSAL: ");
        theTree.inOrderTraverseWrapper();

        System.out.println("POST ORDER TRAVERSAL: ");
        theTree.postOrderTraverseWrapper();
    }
}
