package oct09.trees;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void levelOrder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node cur = q.poll();
            System.out.print(cur.data + " ");
            if(cur.right!=null) q.offer(cur.right);
            if(cur.left!=null) q.offer(cur.left);
        }
    }

    public int height(Node root){
        if(root == null) return -1;
        return Math.max(height(root.left),height(root.right))+1;
    }

    public int size(Node root){
        if(root == null) return 0;
        return size(root.left)+size(root.right)+1;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        // Use a queue to perform level-order traversal and find the first available spot
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            // If the left child is empty, insert the new node here
            if (current.left == null) {
                current.left = newNode;
                break;
            } else {
                queue.offer(current.left);
            }
            // If the right child is empty, insert the new node here
            if (current.right == null) {
                current.right = newNode;
                break;
            } else {
                queue.offer(current.right);  // Otherwise, add right child to the queue
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
//        System.out.println(("Inorder"));
//        tree.inorder(tree.root);
//        System.out.println("\nPreorder");
//        tree.preorder(tree.root);
//        System.out.println("\nLevel order");
//        tree.levelOrder(tree.root);
        System.out.println("Height "+ tree.height(tree.root));
        System.out.println("Size "+ tree.size(tree.root));
    }
}
