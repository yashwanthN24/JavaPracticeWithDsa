package BinarySearchTrees;

import java.util.ArrayList;

public class Merge2BSTs {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);

    }
    
    public static Node sortedArrayToBalancedBst(ArrayList<Integer> arr, int st, int end) {
        
        if(st > end)
            return null;
        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = sortedArrayToBalancedBst(arr, st, mid - 1);
        root.right = sortedArrayToBalancedBst(arr, mid + 1, end);
        return root; 
    }

    public static Node mergeBst(Node root1, Node root2) {

        // get BST1 inorder sequence 
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        // get BST2 inorder sequence 
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // merge bst1 and bst2 inorder sequence to find final sorted sequence 
        int i = 0, j = 0;
        ArrayList<Integer> finaArrayList = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                finaArrayList.add(arr1.get(i));
                i++;
            } else {
                finaArrayList.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            finaArrayList.add(arr1.get(i));
            i++;
        }

        while (j < arr2.size()) {
            finaArrayList.add(arr2.get(j));
            j++;
        }

        // sorted array/ArrayList to BalancedBSt 
        return sortedArrayToBalancedBst(finaArrayList, 0, finaArrayList.size() - 1);

    }
    
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        
        
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        // n nodes tree

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        // m nodes tree

        // O(n+m) Time complexity so linear O(n)
        Node root = mergeBst(root1, root2);
        preorder(root);
    }
}
