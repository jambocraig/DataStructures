package binarysearchtree;

public class BinarySearchTree {
    // attribute
    Node root;

    // trying constructors

    public  BinarySearchTree(){
    }
    public BinarySearchTree(int key, String name){
        this.root = new Node(key, name);
    }

    // adds a new node
    public void addNode(int key, String name) {
        // create the new node (subtree)
        Node newNode = new Node(key, name);

        // if the root is empty - add new node here
        if (root == null) {
            root = newNode;
        } else {
            // adding a new node to the tree
            /*
            using two pointers to identify the parent and child
            until the child is a null value
            then the parent pointer is used to add a child in the null position
             */
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node findNode(int key){
        Node current = this.root;
        while(current.key != key){
            if(key < current.key){
                current = current.leftChild;
            } else{
                current = current.rightChild;
            }
            if(current == null){
                return null;
            }
        }
        return current;
    }

    public void inorder(Node current) {
        if (current != null) {
            inorder(current.leftChild);
            System.out.println(current);
            inorder(current.rightChild);
        }
    }

    public void inorder() {
        Node current = this.root;
        if (current != null) {
            inorder(current.leftChild);
            System.out.println(current);
            inorder(current.rightChild);
        }
    }

    public void preorder(Node current) {
        if (current != null) {
            System.out.println(current);
            preorder(current.leftChild);
            preorder(current.rightChild);
        }
    }

    // preorder starting at the root
    public void preorder() {
        // set a pointer to the root value
        Node current = this.root;
        if (current != null) {
            System.out.println(current);
            preorder(current.leftChild);
            preorder(current.rightChild);
        }
    }

    public void postorder(Node current) {
        if (current != null) {
            postorder(current.leftChild);
            postorder(current.rightChild);
            System.out.println(current);
        }
    }

    public void postorder() {
        // setting a pointer to the root
        Node current = this.root;
        if (current != null) {
            postorder(current.leftChild);
            postorder(current.rightChild);
            System.out.println(current);
        }
    }
}
