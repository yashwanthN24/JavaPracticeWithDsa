package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;
public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3); // O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " "); // O(1)
            pq.remove(); // O(log n )
        }
        
        // By default Less valued attribute gets highest priority i.e processed in  queue first 

        // to change this default behaviour include Comparator.reversedOrder() in priority queue constructor 
        //  to make highest valued element as highest priority i.e first processed in a queue 

    }
}
