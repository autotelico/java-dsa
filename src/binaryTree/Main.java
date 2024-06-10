package binaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree myBinaryTree = new BinaryTree(37);
        myBinaryTree.insert(11);
        myBinaryTree.insert(8);
        myBinaryTree.insert(17);
        myBinaryTree.insert(66);
        myBinaryTree.insert(72);
        myBinaryTree.insert(42);
        System.out.println(myBinaryTree.findValueLevel(42));
    }
}
