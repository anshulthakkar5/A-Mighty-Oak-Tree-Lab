package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appHasAGreeting() {
        App app = new App();
        assertNotNull(app.getGreeting());
    }

    @Test
    void testTreeStructure() {
        BinaryTree tree = new BinaryTree(new Squirrel("Root"));

        BinaryTree.Node left = new BinaryTree.Node(new Squirrel("Left"));
        BinaryTree.Node right = new BinaryTree.Node(new Squirrel("Right"));

        tree.getRoot().setLeft(left);
        tree.getRoot().setRight(right);

        assertEquals("Root", tree.getRoot().data.name);
        assertEquals("Left", tree.getRoot().getLeft().data.name);
        assertEquals("Right", tree.getRoot().getRight().data.name);
    }
}
