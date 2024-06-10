package linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        length = 1;
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public void getHead() {
        if (this.head == null) {
            System.err.println("Lista vazia");
        }
        System.out.println(this.head.value);
    }

    public void getTail() {
        if (this.tail == null) {
            System.err.println("Cauda n aponta pra lugar nenhum");
        }
        System.out.println(this.tail);
    }


    public void print() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(Node node) {
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        this.length++;
    }

    public void prepend(Node node) {
        Node temp = this.head;
        this.head = node;
        this.head.next = temp;
        this.length++;
    }

    public void insertAt(int position, Node newNode){
        int counter = 0;
        Node temp = this.head;
        while (temp.next != null) {
            if (counter == position) {
                Node nextNode = temp.next.next;
                temp.next = newNode;
                newNode.next = nextNode;
                return;
            }
            temp = temp.next;
            counter++;
        }
    }

    public void removeAt(int position) {
        int counter = 0;
        Node temp = this.head;
        Node prevNode = temp;
        if (position == 0) {
            this.head = this.head.next;
            return;
        }
        while (temp != null) {
            if (counter == position) {
                prevNode.next = temp.next;
                return;
            }
            prevNode = temp;
            temp = temp.next;
            counter++;
        }
        System.err.println("Error: position provide is out of bounds!");
    }

    public void removeFirst() {
        this.head = this.head.next;
        this.length--;
    }

    public void removeLast() {
        Node temp = this.head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        this.length--;
    }

    public Node getNodeAt(int position) {
        Node temp = this.head;
        int counter = 0;
        while (temp != null) {
            if (counter == position) {
                return temp;
            }
            temp = temp.next;
            counter++;
        }
        return temp;
    }

    public void getLength() {
//        int counter = 0;
//        Node temp = this.head;
//        while (temp != null) {
//            temp = temp.next;
//            counter++;
//        }
//        System.out.println(counter);
        System.out.println(this.length);
    }


}
