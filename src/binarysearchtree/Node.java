package binarysearchtree;

public class Node {
    // attributes
    int key;
    String name;
    Node leftChild;
    Node rightChild;

    // constructor
    Node (int key, String name){
        this.key = key;
        this.name = name;
        this.leftChild = null;
        this.rightChild = null;
    }

    public String toString(){
        return name + " has a key " + key;
    }
}
