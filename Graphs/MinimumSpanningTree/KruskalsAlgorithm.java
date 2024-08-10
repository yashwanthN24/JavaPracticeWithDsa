package Graphs.MinimumSpanningTree;

import java.util.ArrayList;
import java.util.Collections;

public class KruskalsAlgorithm {

    static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }

        public String toString() {
            return " ( " + this.src + "," + this.dest + "," + this.wt + " ) ";
        }

        public int compareTo(Edge that) {
            return this.wt - that.wt;
        }

    }

    public static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
        edges.add(new Edge(0, 1, 10));
    }

    static int n = 4; // same as the Vertices in graph
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

        // first recursively finds the parent of whole tree and assigns to parent[x]
        // that is returned

        /*
         * 1)Recursively finds the root of the set containing x.
         * 2)Assigns the root to parent[x] to compress the path.
         * 3)Returns the root as the result of the find method.
         */
        return parent[x] = find(parent[x]);
    }

    // Union find Data structure  functions all are O(1) in Time complexity 
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

    // so overall Time complexity of Kruskal is O( V + ElogE )
    public static void kruskalsMST(ArrayList<Edge> edges, int V) {
        init();
        Collections.sort(edges); // O(ElogE)

        int mstcost = 0, count = 0;

        for (int i = 0; count < V - 1; i++) { // O(V)
            Edge e = edges.get(i);// (src , dest , wt)

            int parA = find(e.src);// src = a
            int parB = find(e.dest);// dest = b

            if (parA != parB) {
                // if parents of node src and node dest are not same then we build the tree by
                // combining these two nodes and include cost in mincost and increase count of
                // nodes included in mst
                union(e.src, e.dest);
                mstcost += e.wt;
                count++;
            }

        }

        System.out.println(mstcost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);

        kruskalsMST(edges, V);

    }
}
