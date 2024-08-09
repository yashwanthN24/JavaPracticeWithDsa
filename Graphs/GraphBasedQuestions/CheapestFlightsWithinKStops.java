package Graphs.GraphBasedQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightsWithinKStops {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }

    }

    public static void createGraph(ArrayList<Edge> graph[], int details[][]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < details.length; i++) {
            int src = details[i][0];
            int dest = details[i][1];
            int wt = details[i][2];
            graph[src].add(new Edge(src, dest, wt));
        }

    }

    static class Info {
        int vertex;
        int cost;
        int stops;
        
        public Info(int v, int c, int s) {
            this.vertex = v;
            this.cost = c;
            this.stops = s;
        }
    }
    
    public static int cheapestFlights(int n, int flight[][], int src, int dest, int k) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph, flight);

        int dist[] = new int[n];

        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> queue = new LinkedList<>();

        queue.add(new Info(src, 0, 0));

        while (!queue.isEmpty()) {
            Info curr = queue.remove();

            if (curr.stops > k) {
                break;
            }

            for (int i = 0; i < graph[curr.vertex].size(); i++) {
                Edge e = graph[curr.vertex].get(i);

                // int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if (  curr.cost + wt < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + wt;
                    queue.add(new Info(v, dist[v], curr.stops + 1));
                }

            }
        }
        
        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }

    }
    

    public static void main(String[] args) {
        int n = 4;
        int flight[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        int src = 0, dest = 3, k = 1;

        System.out.println(cheapestFlights(n, flight, src, dest, k));

    }
}
