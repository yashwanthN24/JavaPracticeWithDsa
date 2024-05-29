package BinaryTrees;

public class SubtreeofAnotherTree {

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

    public static boolean isidentical(Node node, Node subroot) {
        // node is where the node is subroot matched 

        // if both nodes are null they are identical so true
        if (node == null && subroot == null) {
            return true;
        }
        // if one node is null other is not null then not identical 
        // and when the data of the two nodes are not same they are not identical so false 
        else if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }

        // left subtree not identical then return false 
        if (!isidentical(node.left, subroot.left)) {
            return false;
        }
        // right subtree not identical then return false 
        if (!isidentical(node.right, subroot.right)) {
            return false;
        }
        // if none of the above condition true then it is obviously identical
        return true;
    }

    public static boolean isSubtree(Node root, Node subroot) {

        // if tree becomes empty then subroot not found so false subtree doesnt exist
        if (root == null) {
            return false;
        }
        
        // when the subroot is found in the tree we check for identical or not 
        if (root.data == subroot.data) {
            if (isidentical(root, subroot)) {
                return true;
            }

        }

        // checking right subtree for subroot or left subtree 
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.right = new Node(6);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(isSubtree(root , subroot));
    }

}
