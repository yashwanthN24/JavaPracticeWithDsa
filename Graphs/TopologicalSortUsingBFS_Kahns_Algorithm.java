package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class TopologicalSortUsingBFS_Kahns_Algorithm {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }

    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void calcIndegree(ArrayList<Edge> graph[], int indegree[]) {
        for (int i = 0; i < graph.length; i++) {
            int v = i; // optional 

            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                indegree[e.dest]++;
            }
        }
    }

    public static void topologicalSortusingBfs(ArrayList<Edge> graph[]) {
        int indegree[] = new int[graph.length];

        calcIndegree(graph, indegree);

        Queue<Integer> q = new LinkedList<>();

        // adding nodes into queues whose indegree is 0 
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " "); // topological sort sequence 

            for (int i = 0; i < graph[curr].size(); i++) {
                int neighbour = graph[curr].get(i).dest;
                indegree[neighbour]--;
                if (indegree[neighbour] == 0) {
                    q.add(neighbour);
                }
            }

        }
    }

    public static void main(String[] args) {

        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        topologicalSortusingBfs(graph);
    }
}

// solve course schedule ii in leetcode to better understand topological sort in solving real world problems

