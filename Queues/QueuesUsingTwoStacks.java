package Queues;

import java.util.Stack;

public class QueuesUsingTwoStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // add - O(n)
    public void add(int item) {

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(item);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

    }
    
    public boolean isEmpty() {
        return s1.isEmpty();
    }

    // remove - O(1)
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }

        return s1.pop();
    }

    // O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return s1.peek();
    }
    public static void main(String[] args) {
        QueuesUsingTwoStacks st = new QueuesUsingTwoStacks();
        st.add(1);
        st.add(2);
        st.add(3);

        while (!st.isEmpty()) {
            System.out.println(st.remove());
        }
    }
}
