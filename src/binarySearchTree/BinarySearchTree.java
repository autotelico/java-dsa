package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int startValue) {
            this.value = startValue;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public BinarySearchTree(int rootValue) {
        this.root = new Node(rootValue);
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insert(root, value);
        }
    }

    public void insert(final Node node, int value) {
        if (node == null) return;
        if (node.value > value) {
            insert(node.left, value);
            node.left = new Node(value);
        }
        if (node.value < value) {
            insert(node.right, value);
            node.right = new Node(value);
        }
    }

    public void preOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            System.out.println(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }
}
