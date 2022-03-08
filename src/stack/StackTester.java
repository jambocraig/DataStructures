package stack;

public class StackTester {
    public static void main(String[] args) {
        // create a stack with capacity 5
        Stack myStack = new Stack(5);
        // test isEmpty
        System.out.println(myStack.isEmpty());
        // test pop
        myStack.pop();
        // populate
        myStack.push(1);
        myStack.push(9);
        myStack.push(8);
        myStack.push(7);
        System.out.println(myStack);
        // testing peek and pop
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }
}
