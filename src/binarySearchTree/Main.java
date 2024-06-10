package binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree(10);
        myBST.insert(7);
        myBST.insert(4);
        myBST.insert(1);
        myBST.preOrder();
    }
}
