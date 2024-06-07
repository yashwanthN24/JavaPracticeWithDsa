package BinarySearchTrees;

import java.util.ArrayList;

public class SortedArrayToBalancedBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node createBST(int arr[], int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;

    }
    
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getinorder(Node root, ArrayList<Integer> inorderseq) {
        if (root == null){
            return;
        }

        getinorder(root.left, inorderseq);
        inorderseq.add(root.data);
        getinorder(root.right, inorderseq);
    }
    
    public static Node bstToBalancedBST(Node root) {
        // Time Complexity = O(n) as getInorder() is O(N) and createBSt also O(N)
        // so O(N) + O(N) = O(2N) => O(N)only as constants are ignored in time complexity considerations 
        

        // get Inorder sequence of the given BST 
        ArrayList<Integer> inorderseq = new ArrayList<>();
        getinorder(root, inorderseq);
        System.out.println(inorderseq + " " + (inorderseq.size()-1));
        // sorted array/arraylist to BalancedBST
        return createBSTUsingSortedArrayList(inorderseq, 0, inorderseq.size() - 1);
        
    }
    
    public static Node createBSTUsingSortedArrayList(ArrayList<Integer> arr, int st, int end) {

        if(st > end)
            return null; 
        
        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBSTUsingSortedArrayList(arr, st, mid - 1);
        root.right = createBSTUsingSortedArrayList(arr,mid+1, end);
        return root; 
    }

    public static void main(String[] args) {
        // int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        // Node root = createBST(arr, 0, arr.length - 1);

        // preorder(root);

        
        // int bst[] = { 8 , 6 , 10 , 5 , 11 , 3 , 12};

        Node root2 = new Node(8);
        root2.left = new Node(6);
        root2.right = new Node(10);
        root2.left.left = new Node(5);
        root2.left.left.left = new Node(3);

        root2.right.right = new Node(11);
        root2.right.right.right = new Node(12);

        root2 = bstToBalancedBST(root2);
        
        preorder(root2);

    }
}
