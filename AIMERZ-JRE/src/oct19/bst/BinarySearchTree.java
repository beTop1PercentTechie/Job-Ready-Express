package oct19.bst;

import oct09.trees.Node;
class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRecord(root, value);
    }

    Node insertRecord(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value <= root.getData())
            root.setLeft(insertRecord(root.getLeft(), value));
        else if (value > root.getData())
            root.setRight(insertRecord(root.getRight(), value));
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.print(root.getData() + " ");
            inorderRec(root.getRight());
        }
    }

    public void morrisInorder(Node root){
        Node cur = root;
        while(cur != null){
            if(cur.getLeft() == null){
                System.out.print(cur.getData() + " ");
                cur = cur.getRight();
            }else{
                Node temp = cur.getLeft();
                while(temp.getRight()!=null && temp.getRight() != cur){
                    temp = temp.getRight();
                }
                if(temp.getRight() == null){
                    temp.setRight(cur);
                    System.out.print(cur.getData());
                }
                else{
                    temp.setRight(null);
                    cur = cur.getRight();
                }
            }
        }
    }
}

