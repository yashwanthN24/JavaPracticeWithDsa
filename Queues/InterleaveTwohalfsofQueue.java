package Queues;

import java.util.Queue;
import java.util.LinkedList;

public class InterleaveTwohalfsofQueue {

    public static void Interleave(Queue<Integer> q) {
        
        // Queue to store firstHalf 
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size() / 2;

        // to separate first size/2 from orginal queue q 
        for (int i = 0; i < size; i++) {
            firstHalf.add(q.remove());
        }
        

        // interleaving 
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        Interleave(q);


        System.out.println(q);

        // or 
        /*
         * while(!q.isEmpty()){
         *     System.out.print(q.remove() + " ");
         * }
         */
    }
}
