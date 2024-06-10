package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static class Node {
        int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public boolean isLeaf() {
            return (this.left == null) && (this.right == null);
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }

    public Node root;

    public BinaryTree(int startValue) {
        this.root = new Node(startValue);
        root.left = null;
        root.right = null;
    }

    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(final Node node) {
        // R E D
        if (node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(final Node node) {
        // E R D
        if (node == null) return;
        if (node.left != null) {
            inOrder(node.left);
        }
        System.out.println(node.value);
        if (node.right != null) {
            inOrder(node.right);
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(final Node node) {
        // E D R
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }

    public void BFS() {
        BFS(root);
    }

    public void BFS(final Node node) {
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

    public void insert(int value) {
        if (root == null) root = new Node(value);
        else {
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (queue.size() > 0) {
                Node currentNode = queue.remove();
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else {
                    queue.add(currentNode.left);
                }

                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    queue.add(currentNode.right);
                }
            }

        }
    }

    public int findValueLevel(int valueToFind) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int counter = 0;
        while (!queue.isEmpty()) {
            Node poppedNode = queue.remove();
            if (poppedNode.value == valueToFind) {
                return counter;
            }
            if (poppedNode.left != null) {
                queue.add(poppedNode.left);
            }
            if (poppedNode.right != null) {
                queue.add(poppedNode.right);
            }
            counter++;
        }
        return -1;
    }

    public Node getRoot() {
        return root;
    }


}
