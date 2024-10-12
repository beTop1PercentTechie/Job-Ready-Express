package oct10.queue;

import oct05.stack.Node;

import java.awt.desktop.QuitResponse;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    private Node front;
    private Node rear;

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int element) {
        Node newNode = new Node(element);
        if (rear == null) {
            front = rear = newNode;
            System.out.println("Enqueued: " + element);
            return;
        }
        rear.setNext(newNode);
        rear = newNode;
        System.out.println("Enqueued: " + element);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int dequeuedElement = front.getData();
        front = front.getNext();

        if (front == null) {
            rear = null;
        }

        System.out.println("Dequeued: " + dequeuedElement);
        return dequeuedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot peek.");
            return -1;
        }
        return front.getData();
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node currentNode = front;
        System.out.print("Queue elements: ");
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        // Insert elements inside queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printQueue();
        // Delete elements
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
