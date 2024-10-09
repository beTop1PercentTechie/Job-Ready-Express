package oct09.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // If the tree is empty, the new node becomes the root
        if (root == null) {
            root = newNode;
            return;
        }

        // Use a queue to perform level-order traversal and find the first available spot
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // If the left child is empty, insert the new node here
            if (current.left == null) {
                current.left = newNode;
                break;
            } else {
                queue.add(current.left);  // Otherwise, add left child to the queue
            }

            // If the right child is empty, insert the new node here
            if (current.right == null) {
                current.right = newNode;
                break;
            } else {
                queue.add(current.right);  // Otherwise, add right child to the queue
            }
        }
    }
}
