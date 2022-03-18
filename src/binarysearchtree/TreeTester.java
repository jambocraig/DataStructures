package binarysearchtree;

public class TreeTester {
    public static void main(String[] args) {
        // create a new BST
        BinarySearchTree myTree = new BinarySearchTree();
        myTree.addNode(4,"London");
        myTree.addNode(10,"Edin");
        myTree.addNode(2,"Car");
        myTree.addNode(17,"Wolvs");

        myTree.postorder(myTree.root);
        System.out.println("\nPreorder");
        myTree.preorder();
        System.out.println("\nInorder");
        myTree.inorder();
        System.out.println("\nSearching");
        System.out.println("Searching key 2");
        System.out.println(myTree.findNode(2));

    }
}
