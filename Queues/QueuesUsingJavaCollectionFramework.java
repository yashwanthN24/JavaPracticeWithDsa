package Queues;

import java.util.LinkedList;
import java.util.Queue;

// or just do import java.util.* ; 

public class QueuesUsingJavaCollectionFramework {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Queue Interface is implemented by two classes - LinkedList and ArrayDeque 
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }



    }
}
