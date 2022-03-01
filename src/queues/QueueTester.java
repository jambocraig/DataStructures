package queues;

public class QueueTester {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        myQueue.enQueue("CAT");
        myQueue.print();
        myQueue.enQueue("DOG");
        myQueue.enQueue("OWL");
        myQueue.print();
    }
}
