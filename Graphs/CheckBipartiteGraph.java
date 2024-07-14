package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheckBipartiteGraph {
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
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));

    }
    

    
    public static boolean isBiPartite(ArrayList<Edge> graph[]) {
        
        // Time complexity : O(V+E) same as bfs TC 

        // Note : If graph doesn't have cycle => BIPARTITE graph 

        // If cycle exists and even cycle length then it is a BIPARTITE Graph 

        // If cycle exists and odd cycle length then it not a BIPARTITE graph



        int color[] = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            color[i] = -1; // no color 
        }
        
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) { // bfs
                queue.add(i);
                color[i] = 0; // yellow 

                while (!queue.isEmpty()) {
                    int curr = queue.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        int neighbour = graph[curr].get(j).dest;

                        // if color not assigned to neighbour  , assign opposite color of curnode and add  neighbour to queue
                        if (color[neighbour] == -1) {
                            int nextColor = color[curr] == 0 ? 1 : 0;
                            color[neighbour] = nextColor;
                            queue.add(neighbour);
                        }

                        // if neighbour node and cur node color same i,e they belonng to same set hence not bipartite (return false)
                        else if (color[neighbour] == color[curr]) {
                            return false;
                        }
                    }
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        
        int V = 5;
        
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        System.out.println(isBiPartite(graph));


    }
}
