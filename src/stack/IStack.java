package stack;

public interface IStack {

    // getters
    int pop();
    boolean isFull();
    boolean isEmpty();
    int peek();
    int size();

    // setters
    void push(int value);

    String toString();
}
