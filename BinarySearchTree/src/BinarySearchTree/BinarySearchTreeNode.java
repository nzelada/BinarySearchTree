package BinarySearchTree;

/**
 * ************************************************************
 * Purpose/Description: <The BinarySearchTreeNode has all the Nodeds>
 * Author’s Panther ID: 
 * Certification: I hereby certify that this work is my own and none of it is
 * the work of any other person.
 * ************************************************************
 */
/*
 This class has the nodes and the main function
 */
public class BinarySearchTreeNode {

    public int key; // int key

    public BinarySearchTreeNode left; // left node

    public BinarySearchTreeNode right; // right node

    public BinarySearchTreeNode(int item) {

        key = item; // assigns it

        left = right = null; // assigns it

    }

    /*
     The main function that would bring the program together
     */
    public static void main(String[] args) {

        int total_sum; // sum

        BinarySearchTree tree = new BinarySearchTree(); // new object

        
        tree.insert(4); // puts it in the tree

        tree.insert(2); // puts it in the tree

        tree.insert(5); // puts it in the tree

        tree.insert(1); // puts it in the tree

        tree.insert(3); // puts it in the tree

        System.out.println("Printing tree: "); // print line

        tree.printTree(); // print line

        System.out.print(" \nTotal sum: "); // print line

        total_sum = tree.keysum();

        System.out.print(total_sum + " "); // print line

        System.out.print("\nMaximum Number is: "); // print line

        int max_number = tree.FindMaximum();

        System.out.print(max_number + " "); // print line

        System.out.print("\nPreOrder is: ");// print line

        tree.printPreOrder();

        tree.deleteMax(max_number);

        System.out.print("\nAfter deletion Tree is: ");// print line

        tree.printTree();
        System.out.print("\n"); // print line

    }

}
