package BinaryTrees;

import java.util.ArrayList;

public class LowestCommonAncestor {

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

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // lowest common ancestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        Node lca = path1.get(i - 1);
        return lca;
    }

    public static Node lcaApproach2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        // search for n1 || n2 in leftsubtree 
        Node leftlca = lcaApproach2(root.left, n1, n2);
        // search for n1 || n2 in rightsubtree 
        Node rightlca = lcaApproach2(root.right, n1, n2);

        // leftlca = val  rightlca = null
        if (rightlca == null) {
            return leftlca;
        }
        // means in righthalf n1 || n2 not present so search in otherhalf further subtrees
        if (leftlca == null) {
            return rightlca;
        }

        // when leftlca and rightlca is not null i.e n1 and n2 exist in left and right subtree so root is the common first ancestor 
        return root;

    }
    
    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        // that node distance to itself is 0 
        if (root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        // case when node is not found at all 
        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    public static int minDist2nodes(Node root, int n1, int n2) {
        Node lca = lcaApproach2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }
    
    public static int kthAncestor(Node root, int n, int k) {
        if (root == null)
            return -1;
        if (root.data == n) {
            return 0;
        }

        int leftDist = kthAncestor(root.left, n, k);
        int rightDist = kthAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }

        return max + 1;
    }

    public static int transformtoSumtree(Node root) {
        if (root == null)
            return 0;
        int leftchild = transformtoSumtree(root.left);
        int rightchild = transformtoSumtree(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = newLeft + leftchild + newRight + rightchild;
        return data;

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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 7;
        System.out.println(lca(root, n1, n2).data);

        System.out.println(lcaApproach2(root, n1, n2).data);

        System.out.println(minDist2nodes(root, n1, n2));

        int n = 5, k = 1;
        kthAncestor(root, n, k); // if we print it will give us the distance from kth ancestor to that node n
    
        transformtoSumtree(root);

        preorder(root);
    }
}
