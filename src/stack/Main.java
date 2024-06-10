package stack;
import stack.Stack.Node;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};

        Stack myStack = new Stack(numbers[0]);

//        we build the stack based on the numbers
        for (int i = 1; i < numbers.length; i++) {
            myStack.add(numbers[i]);
        }
        System.out.println(myStack.getTopNode().value);

//        here, we invert the stack
        Node top = myStack.getTopNode();
        while (top.next != null) {
            top = myStack.remove();
            System.out.println(top.value);
        }
//        done. Stack has inverted the provided values
    }
}
