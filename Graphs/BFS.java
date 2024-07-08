package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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

    public static void bfs(ArrayList<Edge> graph[]) {
        // Time complexity : O(V+E) if we use this adjancancy List approach for graphs V vertices E edges 
        // As we visit each vertex we traverse through each edge atleast once so TC is the sum of the total V vertices and E edges 

        
        // if we use Adjancany Matrix we get Time complexity as O(V^2)
        // So thats the reason why we dont prefer implementing graphs using Adjancany matrix 


        Queue<Integer> queue = new LinkedList<>();

        boolean visited[] = new boolean[graph.length];

        queue.add(0);

        while (!queue.isEmpty()) {
            int curr = queue.remove();

            if (!visited[curr]) {// if curr element not visited 

                // visit the node 

                // visiting the nodes is 3 step process 

                // 1) Mark the node as visited 
                visited[curr] = true;

                // 2) print the node 
                System.err.print(curr + " ");


                // 3) get all neighbour of curr nodee and add it to queue
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    queue.add(e.dest);
                }

            }

        }

    };

    

    public static void main(String[] args) {

        // Vertices of the graph = 7

        int V = 7;

        // Adjancy List to create a graph i.e array of arraylist 
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        System.out.println(Arrays.toString(graph));

        bfs(graph);
    }
}
