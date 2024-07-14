package Graphs;

import java.util.ArrayList;

public class DetectCycleUndirectedGraph {
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

        graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }
    

    // Time complexity : O(V+E)

    // modified dfs approach 
    public static boolean detectCycle(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (detectCycleUtil(graph, visited, i, -1)) {
                    return true;
                    // cycle exists in one of the components/parts of graph
                }
                ;
            }
        }
        
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int parent) {
        
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            int neighbour = graph[curr].get(i).dest;

            // case 3 : neighbour not visited we check further in path if cycle exists
            if (!vis[neighbour]) {
                // normal dfs 
                if (detectCycleUtil(graph, vis, neighbour, curr)) {
                    return true;
                }
            }

            // case 1: 
            else if (vis[neighbour] && neighbour != parent) {
                return true;
            }

            // case 2 : do nothing continue (when neighbour is visited and also parent of curr node)

        }

        return false;
    }

    public static void main(String[] args) {
        
        
        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);


        System.out.println(detectCycle(graph));
    }
}
