package linkedLists;

public class Node {
    // attributes
    private String data;
    private Node next;

    // constructors
    Node(String str){
        this.data = str;
        this.next = null;
    }

    Node(String str, Node next){
        this.data = str;
        this.next = next;
    }

    // getters
    public String getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }

    //setters
    public void setData (String str){
        this.data = str;
    }

    public void setNext(Node n){
        this.next = n;
    }
}
