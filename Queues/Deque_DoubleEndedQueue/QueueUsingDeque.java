package Queues.Deque_DoubleEndedQueue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    
    Deque<Integer> queue = new LinkedList<>();


    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public void add(int item) {
        queue.addLast(item);
    }
    
    public int remove() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return queue.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return queue.getFirst();
    }

    public static void main(String[] args) {
        QueueUsingDeque q = new QueueUsingDeque();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
