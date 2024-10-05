package oct05.stack;

public class LinkedListImplementation {
    private Node top;

    // Inner class to represent a node in the linked list
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedListImplementation() {
        top = null;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed element: " + element);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1;
        }
        int poppedElement = top.data;
        top = top.next;
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;  // Return sentinel value (or throw an exception)
        }
        return top.data;  // Return the data of the top node
    }

    public boolean isEmpty() {
        return top == null;  // Stack is empty if top is null
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
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
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
