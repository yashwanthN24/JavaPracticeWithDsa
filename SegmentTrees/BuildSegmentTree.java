package SegmentTrees;


// Query : Subarray Sum for range qi and qj example: subarray sum for elements in  arr from index 2 to 5

// Update : Update element at idx = 2 to 2 


public class BuildSegmentTree {

    // segment tree array which is visualized as tree but implemented as array just like heaps 
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
        buildST(arr, 2 * i + 2, mid + 1, end);

        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
        // return is optional 
        return tree[i];

    }
    
    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
        // i tracks the index in segment tree (as Segment tree is implemented as array but visualized as a Binary Tree) Tree array intially we start from root node and its present at 0th index 
        // for and node i its left child is at 2*i+1 index 
        // right child is at 2*i +2 index 

        if(qj<=si ||qi >= sj){ //case 1 : Non - overlapping case  so return 0 
            return 0 ;
        }else if(si>=qi && sj <=qj){//case 2 : complete overlap case so include the sum of overlapped part
            return tree[i];
        }else{ // case 3 : Partial Overlap divide it into parts to make it fall into the above two cases 
            int mid = (si+sj)/2;
            int left = getSumUtil(2*i+1 , si , mid , qi , qj);
            int right = getSumUtil(2*i+2 , mid+1 , sj , qi , qj);
            return left + right;
        }

    }

    public static int getSum(int arr[], int qi, int qj) {
        int n = arr.length;

        // si and sj are the ranges for each node it depends on the array the segment tree is built from 
        // si starts from 0 for the root node and sj is the array.length -1 as we store result of the complete array at the root node i.e 0-7 range subarray sum is present at root node 

        // qi and qj are the indexes range whose subarray sum the user wants to calculate

        // we calculate the sum using segment tree unlike using brute force or prefix sum approach as Segment tree provides considerable better time complexity O(log n) over brute force O(n)
        return getSumUtil(0, 0, n - 1, qi, qj);
    }

    
    public static void updateUtil(int i , int si , int sj , int idx , int diff) {
        // This functions updates the segment tree 

        // Time complexity: O(log n )
        
        
        // non overalapping case 
        if (idx > sj || idx < si) {
            return;
        }

        // overlapping case 
        tree[i] += diff;

        if (si != sj) { // non leaf condition 
            int mid = (si + sj) / 2;
            updateUtil(2*i+1, si,mid, idx, diff);
            updateUtil(2*i+2, mid+1, sj, idx, diff);
        }
    }

    public static void update(int arr[], int idx, int newValue) {
        // This function updates the array but not the segment tree 

        int n = arr.length;
        int diff = newValue - arr[idx];
        arr[idx] = newValue;

        updateUtil(0, 0, n-1, idx, diff);
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

        // Segments tree nodes stores a result of a range ex: subarray sum of a range 
        // ex : root node stores subarray sum from 0 to 7 elements of an array 
        // its left child stores subarray sum from 0 to 3 and right child stores 4 to 7 subarray sum of the array

        System.out.println();

        System.out.println(getSum(arr, 2, 5));
        update(arr, 2, 2);
        System.out.println(getSum(arr, 2, 5));
    }
}
