package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(new Node(2));
        myLinkedList.append(new Node(3));
        myLinkedList.append(new Node(4));
        myLinkedList.append(new Node(5));
        myLinkedList.removeAt(0);
        myLinkedList.print();
    }
}