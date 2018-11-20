package com.example.birender_singh.dsa_assignment_andoid.tree;

public class BinaryTree {
    public Node rootNode;

    public void mirrorTree()
    {
        rootNode = mirrorNode(rootNode);
    }

    Node mirrorNode(Node node)
    {
        if (node == null)
            return node;

        /* now mirror left and right subtree */
        Node left = mirrorNode(node.left);
        Node right = mirrorNode(node.right);

        /* swap the left and right nodes */
        node.left = right;
        node.right = left;

        return node;
    }

    public void printInOrder()
    {
        printInOrder(rootNode);
    }

    public void printInOrder(Node node)
    {
        if (node == null)
            return;

        printInOrder(node.left);
        System.out.print(node.data + "  ");

        printInOrder(node.right);
    }
}
