package org.example;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        // Create tree
        BinaryTree tree = new BinaryTree(new Squirrel("Root"));

        // Create nodes
        BinaryTree.Node leftChild = new BinaryTree.Node(new Squirrel("Left"));
        BinaryTree.Node rightChild = new BinaryTree.Node(new Squirrel("Right"));

        // Attach nodes
        tree.getRoot().setLeft(leftChild);
        tree.getRoot().setRight(rightChild);

        // Traverse
        System.out.println("Root: " + tree.getRoot().data.name);
        System.out.println("Left: " + tree.getRoot().getLeft().data.name);
        System.out.println("Right: " + tree.getRoot().getRight().data.name);
    }
}
