package Queues.Deque_DoubleEndedQueue;

import java.util.Deque;
import java.util.LinkedList;

// unlike queue in Dequeue we add , remove , peek from either ends i.e both from rear and frontend or first and last ends 
public class DequeBasicInJCF {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);

        System.out.println("first element of deque :" + deque.getFirst());
        System.out.println("last element of deque :" + deque.getLast());

    }
}
