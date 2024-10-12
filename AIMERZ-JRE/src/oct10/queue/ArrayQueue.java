package oct10.queue;

public class ArrayQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(int element) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full! Cannot enqueue " + element);
            return;
        }
        queueArray[++rear] = element;
        System.out.println("Enqueued: " + element);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int dequeuedElement = queueArray[front];
        for (int i = 0; i < rear; i++) {
            queueArray[i] = queueArray[i + 1];
        }
        rear--;
        System.out.println("Dequeued: " + dequeuedElement);
        return dequeuedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot peek.");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return rear < front;
    }

    public int getSize() {
        return rear - front + 1;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(60);
        queue.enqueue(70);
        queue.printQueue();
        System.out.println("Front element: " + queue.peek());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
