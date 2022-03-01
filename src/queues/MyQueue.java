package queues;

public class MyQueue {
    // attributes
    private final String[] arr;
    private final int MAX_SIZE;
    private int size;
    private int rear;
    private int front;

    MyQueue(int s) {
        this.size = 0;
        this.MAX_SIZE = s;
        this.arr = new String[MAX_SIZE];
        this.front = 0;
        this.rear = 0;
    }

    // getters
    private boolean isEmpty() {
        return this.size == 0;
    }

    private boolean isFull() {
        return this.size == this.MAX_SIZE;
    }

    public String deQueue() {
        if (this.isEmpty()) {
            return null;
        } else {
            String result = this.arr[front];
            this.front++;
            return result;
        }
    }

    // setters
    public void enQueue(String str) {
        if (this.isFull()) {
            System.out.println("error - full");
        } else {
            this.arr[rear] = str;
            this.rear++;
            this.size++;
        }
    }

    public void print(){
        for (int i = front; i < rear; i++) {
            System.out.println(this.arr[i]);
        }
    }



}
