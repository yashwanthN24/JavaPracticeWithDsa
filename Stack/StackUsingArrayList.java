package Stack;

import java.util.ArrayList;
public class StackUsingArrayList {

    ArrayList<Integer> stack;
    

    StackUsingArrayList() {
        stack =  new ArrayList<>();
    }

    StackUsingArrayList(int size) {
        stack = new ArrayList<>(size);
    }

    // push 
    
    public void push(int item) {
        stack.add(item);
    }

    // pop 
    public int pop() {

        if (isEmpty()) {
            return -1;
        }
        
        int value = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return value;

    }

    // peek 
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stack.get(stack.size() - 1);
    }
    
    // isEmpty 

    public boolean isEmpty() {
        return stack.size() == 0;
    }


    public static void main(String[] args) {
        StackUsingArrayList st = new StackUsingArrayList();
        st.push(1);
        st.push(2);
        st.push(3);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
