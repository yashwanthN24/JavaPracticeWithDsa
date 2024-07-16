package SegmentTrees;

// Query : Max Value for subarray (i , j )

// Update : Update element at index (idx) = 2 to value 20 

public class SegmentTreeForMaxElementinaRange {

    static int tree[];

    public static void init(int n) {

        tree = new int[4 * n];
    }


    // Time complexity :O(n)
    public static void buildSegmentTree(int i, int si, int sj, int arr[]) {
        if (si == sj) {
            tree[i] = arr[si];
            return;
        }

        int mid = (si + sj) / 2; // si + (sj-si)/2

        buildSegmentTree(2 * i + 1, si, mid, arr);
        buildSegmentTree(2 * i + 2, mid + 1, sj, arr);

        // cur node value is max of right node and left node
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);

    }


    // O(log n)
    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n - 1, qi, qj);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
        if (si > qj || sj < qi) { // No overlap case
            return Integer.MIN_VALUE;
        } else if (si >= qi && sj <= qj) { // complete overlap case
            return tree[i];
        } else { // partial overlap case
            int mid = (si + sj) / 2;
            int leftans = getMaxUtil(2 * i + 1, si, mid, qi, qj);
            int rightans = getMaxUtil(2 * i + 2, mid + 1, sj, qi, qj);
            return Math.max(leftans, rightans);

        }

    }

    // O(log n )
    public static void update(int arr[], int idx, int newValue) {
        arr[idx] = newValue;
        int n = arr.length;
        // update just updates the array arr

        updateUtil(0, 0, n - 1, idx, newValue);

        // UpdateUtil updates the segment tree because of changes in array arr as
        // segement tree is constructed from the array itself

    }

    public static void updateUtil(int i, int si, int sj, int idx, int newValue) {
        if (idx < si || idx > sj) {
            return;
        }

        // leaf case 
        if (si == sj) {
            tree[i] = newValue;
        }
        
        // non leafs case 
        if (si != sj) {
            tree[i] = Math.max(tree[i], newValue); // for leaf case 
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, newValue);//left
            updateUtil(2 * i + 2, mid + 1, sj, idx, newValue);//right
        }
        
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, -1, 2, 17, 1, 3, 2, 4 };

        int n = arr.length;

        init(n);

        buildSegmentTree(0, 0, n - 1, arr);

        // for (int i = 0; i < tree.length; i++) {
        // System.out.print(tree[i] + " ");
        // }
        // System.out.println();

        System.out.println(getMax(arr, 2, 5));

        update(arr, 2, 20);

        System.out.println(getMax(arr, 2, 5));

        System.out.println();
        for (int i = 0; i < tree.length; i++) {
        System.out.print(tree[i] + " ");
        }

        // here we tested just one query 
        
        // take a for or while loop and provide different values for qi and qj to test a range of queries
        // then the efficieny of the segment trees can be seen easily in terms of the time complexity O(log n )
        
        // showing that its best suited to solve range based queries (i.e two or more questions of same type )

    }
}


// for min value change min to max and max to min wherever possible 