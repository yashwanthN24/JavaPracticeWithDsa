package BinaryTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class TopViewOfBinaryTree {

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

    static class Info {
        // info contains node as well as its horizontal distance hd
        Node node;
        int hd;
        
        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        // we level order traverse the tree 
        Queue<Info> q = new LinkedList<>();
        // map to store unique first horizontal distances and their node 
        HashMap<Integer, Node> map = new HashMap<>();

        // min tracks minimum horizontal distance and max tracks maximum horizontal distance
        int min = 0, max = 0;
        q.add(new Info(root, 0));
        // null to mark the end of current level  in level order traversal
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                // if its first occurence of horizontal distance add it to map as key and value as its node 
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                // get its leftnode and add it to queue and update hd (horizontal distance)
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(curr.hd - 1, min);
                }

                // get its rightnode and add it to queue and update hd (horizontal distance)
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(curr.hd + 1, max);
                }

            }

        }
        
        // Now map contains the nodes that have to be included in topview of tree 

        // min hd to max hd  gives the correct order of nodes when seen from top view 

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " "); // map gives node to get data we use node.data 
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        topView(root);
    }
}
