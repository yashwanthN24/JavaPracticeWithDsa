package Stack;

import java.util.Stack;

public class ReverseStack {

    public static void reversestack(Stack<Integer> st) {
        if (st.empty()) {
            return;
        }
        int topelement = st.pop();
        reversestack(st);
        PushAtBottomofStack.pushAtBottom(st, topelement);

    }

    public static void printStack(Stack<Integer> st) {
        while (!st.isEmpty()) {
            System.out.println(st.pop());

        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        //  3 , 2 , 1 
        reversestack(st);
        //  1 , 2 , 3 
        printStack(st);
    }
}
