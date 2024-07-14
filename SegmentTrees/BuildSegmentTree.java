package SegmentTrees;


public class BuildSegmentTree {

    // segement tree array which is visualized as tree but implemented as array just like heaps 
    static int tree[];

    // setting the array size to 4*n 

    // theoriticaly total nodes comes out to be 2*n -1 but to be on safer side we build the tree with 4*n nodes

    public static void init(int n) {
        tree = new int[4 * n];

    }


    // arr is the numbers array  , i is the root of segment tree , start and end pointers for dividing numbers array recuresively based on mid for building segment tree


    // Time complexity for Constructing Segment tree is O(n)
    public static int buildST(int arr[], int i, int start, int end) {


        // leaf node case 
        if (start == end) {
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end) / 2;
        // left subtree of segment tree 
        buildST(arr, 2 * i + 1, start, mid);

        // right subtree of segement tree
        buildST(arr, 2 * i + 2, mid +1, end);

        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
        // return is optional 
        return tree[i];
    
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;

        // init segment tree size 
        init(n);

        // call buildsegement tree to build tree
        buildST(arr, 0, 0, n - 1);


        // printing segment tree 
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}
