package Graphs.MinimumSpanningTree;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int dest, int wt) {
            this.src = s;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

    }

    static class Pair implements Comparable<Pair> {
        int vertex;
        int cost;

        public Pair(int v, int c) {
            this.vertex = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p) {
            return this.cost - p.cost;
        }
    }

    // public static int MinimumCostSpanningTree(ArrayList<Edge> graph[] , int src)
    // {

    // public static int MinimumCostSpanningTree(ArrayList<Edge> graph[]){

    public static void MinimumCostSpanningTree(ArrayList<Edge> graph[]) {
        // visited to track which nodes are not added into priority queue to include in
        // the MST set
        // Once added their are made true in visited array

        boolean visited[] = new boolean[graph.length];

        // Priority Queue for object provides a min heap and uses a comparator to store
        // elements based on a parameter of the object
        // here we are priortizing w.r.t the cost

        // Hence priority queue now consists of first element as that pair having
        // minimum cost edge

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // starting with node 0 and assuming it has no cost associated with it hence 0

        pq.add(new Pair(0, 0));

        int mincost = 0; // the minimum spanning tree cost

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!visited[curr.vertex]) {
                visited[curr.vertex] = true;

                mincost += curr.cost; // here can add the edges of the minimum spanning tree as well using an
                                      // arraylist

                // get neighbours
                // the idea is to include neighbour nodes with minimum cost edge by adding those
                // nodes with minimum edge cost into priority queue

                for (int i = 0; i < graph[curr.vertex].size(); i++) {
                    Edge e = graph[curr.vertex].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }

            }
        }
        // return mincost;
        System.out.println("Final Minimum Cost of the Minimum spanning tree is : " + mincost);

    }

    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        // System.out.println(MinimumCostSpanningTree(graph, 2));
        // System.out.println(MinimumCostSpanningTree(graph));

        MinimumCostSpanningTree(graph);

    }
}
