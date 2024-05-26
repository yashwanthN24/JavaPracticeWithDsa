package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BuildingBinaryTreeUsingPreorderSequence {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    int idx = -1 ; 

    public Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;

    }

    public void preorder(Node root) {
        // TC : O(n) as we visit each node in the tree atleast once 

        // if root null just return 
        if (root == null) {
            // System.out.print(-1 + " "); this will print the complete preorder sequence required to build the tree including the -1 (nulls) in the tree
            return;
        }

        // print node 
        System.out.print(root.data + " ");
        // left 
        preorder(root.left);
        // right 
        preorder(root.right);
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    
    public void levelOrder(Node root) {
        // if tree is empty root is null so nothing to print just return 
        if (root == null) {
            return;
        }

        // create a Queue to store the nodes to process them level wise bfs 
        Queue<Node> q = new LinkedList<>();
        // add the root node and null intially 
        q.add(root);
        q.add(null);
        // null is used to track when to print nextline \n to show it as level wise 

        while (!q.isEmpty()) {
            Node curNode = q.remove();
            if (curNode == null) {
                // if null we print nextLine \n 
                System.out.println();

                // if after removing  null we see empty queue then we processed all element level wise so just return
                if (q.isEmpty()) {
                    break; // return can be used here
                } else {
                    // else when removing null still elements exist add null to the queue again 
                    q.add(null);
                }
            } else {
                // print curNode that is removed from queue 
                System.out.print(curNode.data + " ");
                // add left and right neighbours to queue  
                if (curNode.left != null) {
                    q.add(curNode.left);
                }

                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }

    }
    public static void main(String[] args) {
        int preorderseq[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BuildingBinaryTreeUsingPreorderSequence tree = new BuildingBinaryTreeUsingPreorderSequence();
        Node root = tree.buildTree(preorderseq);
        System.out.println(root.left.left.data);

        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        System.out.println("Level order");
        tree.levelOrder(root);
    }
}
