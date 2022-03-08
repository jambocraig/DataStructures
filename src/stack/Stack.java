package stack;

public class Stack implements IStack{
    private int top; // points at the upper element or -1 if empty
    private final int[] stack;
    private final int MAX_CAPACITY;

    // constructors
    // default constructor with stack size = 10
    Stack(){
        this.top = -1;
        this.MAX_CAPACITY = 10;
        this.stack = new int[MAX_CAPACITY];
    }

    Stack(int size){
        this.top = -1;
        this.MAX_CAPACITY = size;
        this.stack = new int[MAX_CAPACITY];
    }

    // getters
    @Override
    public int pop() {
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            return -1;
        } else {
            // post fix decrement
            return this.stack[top--];
        }
    }

    @Override
    public boolean isFull() {
        return this.MAX_CAPACITY == this.top + 1;
    }

    @Override
    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public int peek() {
        return this.stack[top];
    }

    @Override
    public int size() {
        return this.top + 1;
    }

    // setter
    @Override
    public void push(int value) {
        if(this.isFull()){
            System.out.println("STACK FULL");
        } else {
            // prefix
            this.stack[++top] = value;
        }
    }

    public String toString(){
        StringBuilder tempStr = new StringBuilder("Stack Contents\n");
        for(int i = this.top; i > -1;i--){
            tempStr.append(this.stack[i]);
            tempStr.append("\n");
        }
        return tempStr.toString();
    }

}
