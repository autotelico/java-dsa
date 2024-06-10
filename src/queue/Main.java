package queue;
import queue.Queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(0);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.remove();
        myQueue.add(4);
        System.out.println(myQueue.getLength());
    }
}