package common;


public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;



    TreeNode(int data){
        this.data = data;
    }

    public TreeNode(){}

    TreeNode(int data, TreeNode left, TreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return "data: " +data;
    }

    public TreeNode root;

    public void insertNode(int value) {
        /* Create a new Node and initialize it */
        TreeNode newNode = new TreeNode(value);

        /* If there is no root this becomes root */
        if(root == null){
            root = newNode;
        }else{
            /* Set root as the Node, which we will use to traverse the tree */
            TreeNode currentNode = root;

            /* Future parent node of our new node */
            TreeNode parent;

            while(true){
                parent = currentNode;
                if(value <= currentNode.data){
                    /* Switch focus to the left child */
                    currentNode = currentNode.left;

                    if(currentNode == null){
                        /* Then place the new node on the left of it */
                        parent.left = newNode;
                        return;
                    }
                } else {
                    /* Switch focus to the right child */
                    currentNode = currentNode.right;

                    if(currentNode == null){
                        /* Then place the new node on the left of it */
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
}

