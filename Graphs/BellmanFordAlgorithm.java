package Graphs;

import java.util.ArrayList;

// BellmanFord can be used for negative weights  graphs as well as positive weights

// but dijkstra doesnt provide correct results with negative weights  so we use Bellman for negative weights strictly 


public class BellmanFordAlgorithm {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    static void createGraph2(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));

        graph.add(new Edge(1, 2, -4));

        graph.add(new Edge(2, 3, 2));

        graph.add(new Edge(3, 4, 4));

        graph.add(new Edge(4, 1, -1));
    }

    // public static void bellmanFord(ArrayList<Edge> graph[] , int src ){
    //     int dist[] = new int[graph.length];

    //     for(int i = 0 ; i<dist.length;i++){
    //         if(i != src){
    //             dist[i] = Integer.MAX_VALUE;
    //         }
    //     }

    //     int V = graph.length;
    //     // Overall Time complexity of Bellman Ford algo = O(V*E)

    //     // Algorithm -O(V)
    //     for (int i = 0; i < V - 1; i++) {
    //         // get edges (u , v ) => Time complexity will depend on no of edges in graph = O(E)
    //         for (int j = 0; j < graph.length; j++) {
    //             for (int k = 0; k < graph[j].size(); k++) {
    //                 Edge e = graph[j].get(k);
    //                 // u , v , wt
    //                 int u = e.src;
    //                 int v = e.dest;
    //                 int wt = e.wt;
    //                 // relaxation
    //                 // because distance[u] is Integer.MAX_VALUE adding some weight to it makes it overflow to negative value making it less for next iteration 
    //                 // so we had a check tha dist[u] must not be Integer.MAX_VALUE
    //                 if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
    //                     dist[v] = dist[u] + wt;
    //                 }

    //             }
    //         }

    //     }

    //     // Print shortest Paths
    //     for (int i = 0; i < dist.length; i++) {
    //         System.out.print(dist[i] + " ");
    //     }
    // }

    public static void bellmanFord2(ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V];

        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        
        // overal time complexity : O(V*E)
        // O(V)
        for (int i = 0; i < V - 1; i++) {
            // getEdges -O(E)
            for (int j = 0; j < graph.size(); j++) {
                
                    Edge e = graph.get(j);
                    // u , v , wt
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    // relaxation
                    // because distance[u] is Integer.MAX_VALUE adding some weight to it makes it overflow to negative value making it less for next iteration 
                    // so we had a check tha dist[u] must not be Integer.MAX_VALUE
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }

                }
            }

        

        // Print shortest Paths
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph = new ArrayList<>();

        // createGraph(graph);
        createGraph2(graph);
        bellmanFord2(graph, 0 , V);
    }
}