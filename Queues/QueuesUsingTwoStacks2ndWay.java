package Queues;

import java.util.Stack;

public class QueuesUsingTwoStacks2ndWay {
    
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();

    }

    public void add(int item) {
        s1.push(item);
    }
    
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty ");
            return -1; 
        }
        

        while (!s1.empty()) {
            s2.push(s1.pop());
        }


        return s2.pop();
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty ");
            return -1;
        }

        while (!s1.empty()) {
            s2.push(s1.pop());
        }

        return s2.peek();
    }
    
    public static void main(String[] args) {
        // add - direct push to s1 stack 
        // remove and peek - while s1 is empty push all elements of s1 to s2
        // for remove return s2.pop() 
        // for peek return s2.peek()

        // isEmpty() - returns true if both s1 and s2 stacks are empty 
        
        QueuesUsingTwoStacks2ndWay q = new QueuesUsingTwoStacks2ndWay();
        q.add(1);
        q.add(2);
        q.add(3);

        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
