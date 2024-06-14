package Heaps;

import java.util.PriorityQueue;

public class NearbyCars {
    // to provide default comparsion   logic for sorting object of this class (Comparator)
    static class Point{ //implements Comparable<Point>{
        int x;
        int y;
        int distsqr;
        int idx;

        public Point(int x, int y, int distsqr  , int idx) {
            this.x = x;
            this.y = y;
            this.distsqr = distsqr;
            this.idx = idx;
        }

        // @Override
        // public int compareTo(Point o) {
        //     return this.distsqr - o.distsqr; // Ascending order 
        // }
        
        public String toString() {
            return "(" + x + " , " + y + " )";
        }


    }
    public static void main(String[] args) {
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>((o1 , o2) -> o1.distsqr - o2.distsqr); // less distance sqr comes first in priority queue 
        for (int i = 0; i < pts.length; i++) { // n times O(logn)  gets called so O(nlogn)
            //  d^2 = x^2 + y^2 
            int distsqr = (pts[i][0] * pts[i][0]) + (pts[i][1] * pts[i][1]);
            // adding the point to priority queue 
            pq.add(new Point(pts[i][0], pts[i][1], distsqr, i)); // O(logn ) add operatation in priority queue 
        }

        
        // printing k nearest points/cars by removing elememts from priority queue 
        // priority has already prioritized which is nearest through the comparator we provided along with the point class 

        for (int i = 1; i <= k; i++) {
            System.out.println("C" + pq.remove().idx);
        }
        
        // C0 and C2 are the two points that are nearest to the orgin 

        // Time complexity : O(nlogn)
    }
}
