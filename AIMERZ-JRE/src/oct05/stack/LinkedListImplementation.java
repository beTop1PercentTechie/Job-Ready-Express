package oct05.stack;

public class LinkedListImplementation {
    private Node top;

    public LinkedListImplementation() {
        top = null;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.setNext(top);
        top = newNode;
        System.out.println("Pushed element: " + element);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1;
        }
        int poppedElement = top.getData();
        top = top.getNext();
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;  // Stack is empty if top is null
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        Node current = top;
        System.out.print("Stack elements: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
