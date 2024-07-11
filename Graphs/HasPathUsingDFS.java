package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class HasPathUsingDFS {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        public String toString() {
            return "" + this.dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

    }
    
    public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean visited[]) {
        // Time complexity : O(V+E) i.e total number of vertices and edges in graphs 

        // when src and destination are same 
        if (src == dest) {
            return true;
        }

        // mark source as visited
        visited[src] = true;

        // check if we can reach dest through src neighbours 
        for (int i = 0; i < graph[src].size(); i++) {
            int neighbour = graph[src].get(i).dest;
            if (!visited[neighbour] && hasPath(graph, neighbour, dest, visited)) {
                return true;
            }
        }

        // if we cant reach dest in any way there is no path so return false 
        return false; 
    }

    public static void main(String[] args) {
        
        
        // Vertices of the graph = 7

        int V = 7;

        // Adjancy List to create a graph i.e array of arraylist 
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        System.out.println(Arrays.toString(graph));

        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
    }
}
