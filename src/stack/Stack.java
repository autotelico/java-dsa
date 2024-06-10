package stack;
// Node is a built-in class for this class.
public class Stack {
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node topNode;
    private int height;

    public Stack(int value) {
        this.topNode = new Node(value);
        this.height = 1;
    }

    public void print() {
        Node temp = this.topNode;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void add(int value) {
        Node newNode = new Node(value);
        Node prevTopNode = this.topNode;
        this.topNode = newNode;
        newNode.next = prevTopNode;
        height++;
    }

    public Node remove() {
        this.topNode = this.topNode.next;
        height--;
        return this.topNode;
    }


    public Node getTopNode() {
        return topNode;
    }

    public int getHeight() {
        return height;
    }

}
