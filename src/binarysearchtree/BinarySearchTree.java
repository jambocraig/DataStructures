package binarysearchtree;

public class BinarySearchTree {
    // attribute
    Node root;

    // adds a new node
    public void addNode(int key, String name) {
        // create the new node (subtree)
        Node newNode = new Node(key, name);

        // if the root is empty - add new node here (hence no constructor)
        if (root == null) {
            root = newNode;
        } else {

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

    public void inorder(Node current) {
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

    public void postorder(Node current) {
        if (current != null) {
            postorder(current.leftChild);
            postorder(current.rightChild);
            System.out.println(current);
        }
    }
}
