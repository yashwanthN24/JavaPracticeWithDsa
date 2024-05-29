package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class KthLevel {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // iterative approach - Easiest one 
    public static void kthlevelprint(Node root, int leveltoprint) {
        // level order traverse the queue 
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 1;
        // we are currently in level1 , level variable tracks the current level we are in
        while (!q.isEmpty()) {
            Node cur = q.remove();
            if (cur == null) {
                if (q.isEmpty()) {
                    return;
                } else {
                    // level is up so increment it 
                    level++;
                    q.add(null);
                }
            } else {
                // if level is leveltoprint only we print the nodes of that level 
                if (level == leveltoprint) {
                    System.out.print(cur.data + " ");
                }

                // add neighbours to queue 
                if (cur.left != null) {
                    q.add(cur.left);
                }

                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
    }
    
    public static void KthLevelRecursiveApproach(Node root, int level, int leveltoprint) {
        
        // we are using preorder traversal here  NLR (node , leftNode , rightNode)
        // if root is null tree empty so ntg to print just return 
        if (root == null) {
            return;
        }
        // if level == leveltoprint only we print the root node N 
        if (level == leveltoprint) {
            System.out.print(root.data + " ");
            return;
        }

        // go to leftsubtree of next level   L
        KthLevelRecursiveApproach(root.left, level+1, leveltoprint);
        // go to rightsubtree of next level  R
        KthLevelRecursiveApproach(root.right, level+1, leveltoprint);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // kthlevelprint(root, 1);
        
        KthLevelRecursiveApproach(root, 1, 3);
    }
}
