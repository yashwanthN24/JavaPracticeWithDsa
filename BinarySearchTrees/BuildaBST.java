package BinarySearchTrees;

import java.util.ArrayList;


public class BuildaBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insertinBST(Node root, int val) {

        // if root is null our new Node with val is our root
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // if val < root value then insertin left subtree i.e root.left
        if (val < root.data) {
            root.left = insertinBST(root.left, val);
        } else {
            // else insertin rightsubtree when val > root value
            root.right = insertinBST(root.right, val);
        }

        return root;

    }

    // or
    public static Node buildBst(Node root, int val) {
        Node newNode = new Node(val);
        if (root == null) {
            return newNode;
        }
        Node prev = null;
        Node cur = root;
        while (cur != null) {
            prev = cur;
            if (cur.data > val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }

        }

        if (val < prev.data) {
            prev.left = newNode;
        } else {
            prev.right = newNode;
        }

        return root;
    }

    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        // first we have to search for the node with value as val in the tree to delete
        // it if found

        if (root.data < val) {
            // right subtree search and delete and store the modified right subtree in
            // root.right
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            // left subtree search and delete and store the modified left subtree in
            // root.left
            root.left = delete(root.left, val);
        } else {
            // when root == val node to be deleted
            // case 1 - leaf node case
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - single (one) child case
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 - Two children Node

            // finding inorder successor
            Node IS = findInorderSuccessor(root.right); // because Inorder successor is left most node in right subtree

            // replace node to be deleted value with IS (inorder successor
            root.data = IS.data;

            // delete the already existing node with IS , thereby finally maintaining BST
            // Properties even after deletion of node

            root.right = delete(root.right, IS.data);
        }

        // finally return the rooot of the modified BST tree after deletion of node
        return root;
    }

    public static Node findInorderSuccessor(Node RightsubtreeNode) {
        // here we recieve the nodes right subtree

        // we shld just return the leftmost node in this rightsubtree as that becomes
        // the inorder successor by the definition

        while (RightsubtreeNode.left != null) {
            RightsubtreeNode = RightsubtreeNode.left;
        }

        // return the Inorder successor
        return RightsubtreeNode;

    }

    public static void printInRange(Node root, int k1, int k2) {

        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }

        /*
         * If the data in the root node is less than k1, the method recursively calls
         * itself to print the data in the right subtree (printInRange(root.right, k1,
         * k2)). This is because if the root's data is less than k1, then all the data
         * in the right subtree will be greater than the root's data, and hence could
         * potentially fall within the range [k1, k2].
         * 
         * If the data in the root node is greater than k2, the method recursively calls
         * itself to print the data in the left subtree (printInRange(root.left, k1,
         * k2)). This is because if the root's data is greater than k2, then all the
         * data in the left subtree will be less than the root's data, and hence could
         * not fall within the range [k1, k2].
         */
    }

    public static void printPath(ArrayList<Integer> path) {
        
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }

        System.out.println("Null");
    }

    public static void printRoottoLeafPaths(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        // add the node to path
        path.add(root.data);

        // if we reach leaf node print the path 
        if (root.left == null && root.right == null) {
            // path.add(root.data);
            // System.out.println(path);
            printPath(path);
            // path.remove(path.size() - 1);
            // return;
        }

        // else we go till the leafnodes of left subtree
        printRoottoLeafPaths(root.left, path);
        // we go till the leafnodes of right subtrees for different root to leaf paths 
        printRoottoLeafPaths(root.right, path);
        // finally we remove each node while backtracking to print next root to leaf path 
        path.remove(path.size() - 1);

    }

    public static boolean ValidBST(Node root, Node min, Node max) {
        
        // if empty tree its obvious a valid BST
        if (root == null) {
            return true;
        }

        // case when root data < valid min range satisfying BST property
        if (min != null && root.data <= min.data) {
            return false;
        }

        // case when root data > valid max range satisfying BST property
        else if (max != null && root.data >= max.data) {
            return false;
        }


        // check for leftsubtree and rightsubtree if both return true ValidBST else Invalid (false)
        return ValidBST(root.left, min, root) && ValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        // int values[] = { 5, 1, 3, 4, 2, 7 };
        // int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        // int values[] = { 8, 5, 3, 6, 10, 11, 14 };

        int values[] = { 1, 1, 1 }; 

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = buildBst(root, values[i]);
        }

        // inorder traversal of BST Gives a Sorted Sequence
        // inorder(root);
        // System.out.println();
        // System.out.println(search(root, 12));
        // if (search(root, 12)) {
        // System.out.println("found");
        // } else {
        // System.out.println("Not found");
        // }
        // delete(root, 5);
        // inorder(root);

        System.out.println();
        printInRange(root, 5, 12);


        System.out.println();
        printRoottoLeafPaths(root, new ArrayList<>());

        if (ValidBST(root, null, null)) {
            System.out.println("valid");
        } else {
            System.out.println("Invalid");
        }

        // output invalid : as BST has no duplicates in our case 

    }
}

/*
 * Sign Extension (>>):
 * 
 * The >> operator preserves the sign of the original number by filling the
 * leftmost bits with the sign bit.
 * Useful for signed arithmetic operations where sign preservation is required.
 * 
 * Zero Fill (>>>):
 * 
 * The >>> operator always fills the leftmost bits with zeros, regardless of the
 * original sign.
 * Useful for operations where the sign of the number is not relevant, such as
 * when treating the number as an unsigned integer.
 */