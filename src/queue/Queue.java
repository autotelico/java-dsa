package queue;

public class Queue {
    public static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private int length;
    private Node first;
    private Node last;

    public Queue(int startValue) {
        Node newNode = new Node(startValue);
        this.first = newNode;
        this.last = newNode;
        this.length = 1;
    }

    public void add(int nodeValue) {
        Node newNode = new Node(nodeValue);
        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        last = newNode;
        length++;
    }

    public void remove() {
        first = first.next;
        length--;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }
}
