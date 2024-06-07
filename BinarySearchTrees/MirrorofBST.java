package BinarySearchTrees;

public class MirrorofBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node createMirror(Node root) {
        if (root == null) {
            return null;
        }

        // getMirror of left subtree recursively
        Node leftSubtreeMirror = createMirror(root.left);
        // getMirror of right subtree recursively
        Node rightSubtreeMirror = createMirror(root.right);
        // swap left and right links of root to point to mirrors of left and right subtree recieved from recursive calls 
        root.left = rightSubtreeMirror;
        root.right = leftSubtreeMirror;
        // finally return root to upper levels in recursion
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

    public static void main(String[] args) {
        
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        preorder(root);
        root = createMirror(root);
        System.out.println();
        // System.out.println(root.left.data);


        // preorder is proper to print the tree as it is Node left and right 
        preorder(root);
    }
}
