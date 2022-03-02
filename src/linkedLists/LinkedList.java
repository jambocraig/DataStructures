package linkedLists;

public class LinkedList {
    // attributes
    Node head;
    int count;

    LinkedList(String str){
        this.head = new Node(str);
        this.count = 1;
    }

    public void addNode(String d){
        // create a new node with the data
        Node last = new Node(d);
        // find the end
        Node pointer = this.head;
        while (pointer.getNext() != null){
            pointer = pointer.getNext();
        }
        pointer.setNext(last);
        this.count++;
    }

    public String get(int index){
        if (index <= 0){
            return null;
        }
        Node current = this.head;
        for (int i = 1; i < index; i++){
            current = current.getNext();
        }
        return current.getData();
    }

    public int size(){
        return this.count;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void remove(){
        Node current = this.head;
        while (current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        this.count--;
    }



}
