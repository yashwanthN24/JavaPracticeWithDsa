package BinaryTrees;

public class HeightOfTree {

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

    public static int countNodesInTree(Node root) {
        // if tree is empty no nodes so count = 0 
        if (root == null) {
            return 0;
        }

        // get leftsubtree count 
        int leftcount = countNodesInTree(root.left);

        // get rightsubtree count 

        int rightcount = countNodesInTree(root.right);

        // finalcount is leftsubtreecount + rightsubtreecount  + 1 
        return leftcount + rightcount + 1;

    }

    public static int height(Node root) {
        // if tree is empty i.e root = null then height = 0 
        if (root == null) {
            return 0;
        }

        // get left subtree height 
        int leftheight = height(root.left);
        // get right subtree height 
        int rightheight = height(root.right);

        // return max(leftheight , rightheight) + 1 to calculate its parent height(thereby the overall height of the tree )

        return Math.max(leftheight, rightheight) + 1;
        // i.e returning the maxheight of the leave to its parent to calculate the overall height 

    }

    public static int SumOfNodes(Node root) {
        // if tree is empty - No nodes so sum also 0 
        if (root == null) {
            return 0;
        }

        // get left subtree sum of nodes 
        int leftsum = SumOfNodes(root.left);

        // get right subtree sum of nodes 
        int rightsum = SumOfNodes(root.right);

        // final sumofNodes is leftsum + rightsum + currentrootNodeData
        return leftsum + rightsum + root.data;

    }
    

    public static int DiameterOfTree(Node root) {
        // Approach 1 

        // Time complexity : O(n^2) as for each  node we find diameter as well as height 
        // N nodes diameter finding  each O(n) for height calculation  so O(n^2)

        // if tree empty no nodes so no diameter 
        if (root == null) {
            return 0;
        }

        // diameter not passing through root 
        int leftDiameter = DiameterOfTree(root.left);
        int leftheight = height(root.left);
        int rightDiameter = DiameterOfTree(root.right);
        int rightheight = height(root.right);

        // for diamter passing through root 
        int selfDiamter = leftheight + rightheight + 1;

        // finally return the maximum diameter 

        return Math.max(selfDiamter, Math.max(rightDiameter, leftDiameter));
    }

    static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }

    }

    public static Info diameteroftree(Node root) {
        // approach 2 - O(n)
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameteroftree(root.left);
        Info rightInfo = diameteroftree(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);
        System.out.println(height(root));

        System.out.println(countNodesInTree(root));

        System.out.println(SumOfNodes(root));

        System.out.println(DiameterOfTree(root));

        System.out.println(diameteroftree(root).diam);
    }
}
