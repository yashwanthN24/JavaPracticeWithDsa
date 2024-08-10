package Graphs.MinimumSpanningTree;

import java.util.Arrays;

// very efficient data structure 

// Applications of this Data structure :

// can be used for cycle detection in undirected 

// To find Minimum spanning tree using kruskals algorithm 


// Time complexity : O(4k) where k is constant  maximum it turns out to be O(4) in maximum cases 

// So both Time complexity and space complecity are considered as O(1) constant time and space 


public class UnionFindDataStructure {
    static int n = 8;
    static int parent[] = new int[n];
    static int rank[] = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public static int find(int x) {
        if (x == parent[x]) {
            return x;
        }

        // first recursively finds the parent of whole tree and assigns to parent[x] that is returned 

        /*
        1)Recursively finds the root of the set containing x.
        2)Assigns the root to parent[x] to compress the path.
        3)Returns the root as the result of the find method.
         */
        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            parent[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            parent[parA] = parB;
        } else {
            parent[parB] = parA;
        }
    }
    
    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));

        union(1, 5);
        System.out.println(Arrays.toString(parent));
        System.out.println(Arrays.toString(rank));
    }
}
