package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponentsBFSDFS {
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

        boolean visited[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                bfsUtil(graph, i, visited);
            }
        }
    }
    
    public static void bfsUtil(ArrayList<Edge> graph[] , int startnode , boolean visited[]) {
        // Time complexity : O(V+E) if we use this adjancancy List approach for graphs V vertices E edges 
        // As we visit each vertex we traverse through each edge atleast once so TC is the sum of the total V vertices and E edges 

        
        // if we use Adjancany Matrix we get Time complexity as O(V^2)
        // So thats the reason why we dont prefer implementing graphs using Adjancany matrix 


        Queue<Integer> queue = new LinkedList<>();


        queue.add(startnode);

        while (!queue.isEmpty()) {
            int curr = queue.remove();

            if (!visited[curr]) {// if curr element not visited 

                // visit the node 

                // visiting the nodes is 3 step process 

                // 1) Mark the node as visited 
                visited[curr] = true;

                // 2) print the node 
                System.out.print(curr + " ");


                // 3) get all neighbour of curr nodee and add it to queue
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    queue.add(e.dest);
                }

            }

        }

    };


    public static void dfs(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfsUtil(graph, i, visited);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge> graph[], int curnode, boolean visited[]) {

        // Time complexity : O(V+E)
        // where V and E are total number of vertices and edges in graphs
        

        // visit the node 
        System.out.print(curnode + " ");
        visited[curnode] = true;

        // get neighbours of curNode 
        for (int i = 0; i < graph[curnode].size(); i++) {

            int neighbour = graph[curnode].get(i).dest;
            // if neighbour is not visited then we visit it else call for next neighbour 
            if (!visited[neighbour]) {
                dfsUtil(graph, neighbour, visited);
            }
        }

    }

    

    public static void main(String[] args) {

        // Vertices of the graph = 7

        int V = 7;

        // Adjancy List to create a graph i.e array of arraylist 
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        System.out.println(Arrays.toString(graph));


        // The DFS sequence is 
        System.out.println("The dfs sequence is :");
        // dfsUtil(graph, 0, new boolean[V]);
        dfs(graph);
        

        System.out.println();

        // The bfs sequence is 
        System.out.println("The bfs sequence is :");
        // bfsUtil(graph, 0 , new boolean[V]);
        bfs(graph);
    }
}

// we extended bfs and dfs so that it works for disconnected graph as well traversing all components that are unvisited 

