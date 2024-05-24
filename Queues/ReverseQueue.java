package Queues;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;


public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> q) {
        // create a stack to reverse queue elements 
        Stack<Integer> st = new Stack<>();


        // push all queue elements into stack 
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        

        // push back all stack elements back to queue q 
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // now the queue is reversed due to stack 
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            q.add(i);
        }

        System.out.println(q);
        reverseQueue(q);
        System.out.println(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
