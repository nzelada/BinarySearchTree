package BinarySearchTree;

/**
 * ************************************************************
 * Purpose/Description: <The BinarySearchTree will get the numbers in the tree
 * and get the sum of it and show them in different orders>
 * Author’s Panther ID: 
 * Certification: I hereby certify that this work is my own and none of it is
 * the work of any other person.
 * ************************************************************
 */
public class BinarySearchTree {

    BinarySearchTreeNode root; // roof og BST

    int total; // the total

// Constructor
    BinarySearchTree() {

        root = null; // setting it to null

        total = 0; // setting total to 0

    }

    /*
     This method will delete the root of the given key
     */
    void deleteMax(int key) {

        root = deleteRec(root, key); // calls the deleteRec method with root and key

    }

    /* 
     A recursive method that puts in a new key in BST
     */
    BinarySearchTreeNode deleteRec(BinarySearchTreeNode root, int key) {

        if (root == null) { // if root is empty
            return root;
        }

        if (key < root.key) { // if not, do recursive
            root.left = deleteRec(root.left, key); // left root
        } else if (key > root.key) { // if key is higher
            root.right = deleteRec(root.right, key); // right root
        } // if same key, then delete node
        else {

            if (root.left == null) { // if node has one or two
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // node with two parts, gets the smallest in the right subtree,
            // and deletes the other
            root.right = deleteRec(root.right, root.key);

        }

        return root; // return root

    }
    /*
     Look for the max value of the true and returns it
     */

    int maxValue(BinarySearchTreeNode root) {

        int maxv = root.key;

        while (root.right != null) {

            maxv = root.right.key;

            root = root.right;

        }

        return maxv;

    }
    /*
     This is a helper method in which returns the maximum root
     */

    int FindMaximum() {

        return maxValue(root);

    }

    /*
     This called the insertRec method with the root and key
     */
    void insert(int key) {

        root = insertRec(root, key);

    }

    /* A recursive function to insert a new key in BST */
    BinarySearchTreeNode insertRec(BinarySearchTreeNode root, int key) {

        /* If the tree is empty, return a new node */
        if (root == null) {

            root = new BinarySearchTreeNode(key);

            return root;

        }

        /* 
         Otherwise, recursive down the tree
         */
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        /* return the node that wasn't changed */
        return root;

    }

    /* 
     This method  calls inorderRec()
     */
    public void printTree() {

        inorderRec(root);

    }

    /*
     This method puts them in a certain order 
     */
    void inorderRec(BinarySearchTreeNode root) {

        if (root != null) {

            inorderRec(root.right);

            System.out.print(root.key + " ");

            inorderRec(root.left);

        }

    }

    /*
     This method mainly calls printPreOrderRec()
     */
    public void printPreOrder() {

        printPreOrderRec(root);

    }

    /*
     Prints in the pre order
     */
    void printPreOrderRec(BinarySearchTreeNode root) {

        if (root != null) {
            System.out.print(root.key + " ");
            printPreOrderRec(root.left);
            printPreOrderRec(root.right);

        }

    }
    /*
     Call the calculateSum method with root and returns it
     */

    public int keysum() {

        return calculateSum(root); // calls the method with root

    }
    /*
     Returns and calculates the sum
     */

    int calculateSum(BinarySearchTreeNode root) {

        if (root != null) { // if not null

            calculateSum(root.left);

            calculateSum(root.right);

            if (root.key > 0) {
                total = total + root.key; // adding
            }

        }

        return total; // returns it

    }

}
