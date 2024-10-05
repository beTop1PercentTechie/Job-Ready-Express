package oct05.stack;

public class ArrayImplementation {
    private int[] stackArray;
    private int top;
    private int capacity;

    public ArrayImplementation(int size) {
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push element " + element);
            return;
        }
        stackArray[++top] = element;  // Increment top and add element
        System.out.println("Pushed element: " + element);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1; // Return a sentinel value (could also throw an exception)
        }
        System.out.println("Popped element: " + stackArray[top]);
        return stackArray[top--];  // Return top element and decrement top
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
