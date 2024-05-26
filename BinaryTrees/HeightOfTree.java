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
    }
}
