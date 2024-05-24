package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StacksUsing2Queues2ndWay {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    public void push(int item) {
        // Add the new element to q2
        q2.add(item);

        // Transfer all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap the names of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Remove and return the top element from the stack
    public int pop() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q1.remove();
    }

    // Return the top element from the stack without removing it
    public int peek() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return q1.peek();
    }

    public static void main(String[] args) {
        StacksUsing2Queues2ndWay stack = new StacksUsing2Queues2ndWay();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek()); // Should print 30
        System.out.println("Popped element is: " + stack.pop()); // Should print 30
        System.out.println("Top element is: " + stack.peek()); // Should print 20
        System.out.println("Popped element is: " + stack.pop()); // Should print 20
        System.out.println("Top element is: " + stack.peek()); // Should print 10
    }
}
