package Queues.Deque_DoubleEndedQueue;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {

    Deque<Integer> stack = new LinkedList<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int item) {
        stack.addLast(item);
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack.removeLast();
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.getLast();
    }
    public static void main(String[] args) {
        StackUsingDeque s = new StackUsingDeque();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
