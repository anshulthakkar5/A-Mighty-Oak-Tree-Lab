package org.example;

public class BinaryTree {

    // Node class (object-based nodes)
    public static class Node {
        public Squirrel data;
        public Node left;
        public Node right;

        public Node(Squirrel data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setLeft(Node node) {
            this.left = node;
        }

        public void setRight(Node node) {
            this.right = node;
        }
    }

    private Node root;

    public BinaryTree(Squirrel data) {
        root = new Node(data);
    }

    public Node getRoot() {
        return root;
    }
}
