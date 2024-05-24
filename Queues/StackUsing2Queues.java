package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    public void push(int item) {
        //  push element to non - empty queue 
        if (!q1.isEmpty()) {
            q1.add(item);
        } else {
            q2.add(item);
        }
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }

        int top = -1;

        // pop is implemented by shifting elements from one non-empty queue to empty queue 
        // top variable keeps track of the last element of the queue which happens to be the first element to popped out in a stack
        
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.remove();
                if (q1.isEmpty()) {
                    break;
                }
                q2.add(top);
            }
        } else {
            while (!q2.isEmpty()) {
                top = q2.remove();
                if (q2.isEmpty()) {
                    break;
                }

                q1.add(top);
            }
        }

        return top;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty stack");
            return -1;
        }

        int top = -1 ;
        
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.remove();
                q2.add(top);
            }
        } else {
            while (!q2.isEmpty()) {
                top = q2.remove();
                q1.add(top);
            }
        }


        return top;
    }

    public static void main(String[] args) {
        StackUsing2Queues q = new StackUsing2Queues();
        q.push(1);
        q.push(2);
        q.push(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }
}
