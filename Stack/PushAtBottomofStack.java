package Stack;

import java.util.Stack;

public class PushAtBottomofStack {

    public static void pushAtBottom(Stack<Integer> st, int item) {

        // base case : when the stack becomes empty push the item into the stack and return to add back the popped elements 
        if (st.isEmpty()) {
            st.push(item);
            return;
        }

        // pop the topmost element of the stack and store it sp that its added back again after pushing item at bottom 
        int topelement = st.pop();

        // keep popping and storing till stack become empty 
        pushAtBottom(st, item);

        // push back the popped elements 
        st.push(topelement);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(st);
        pushAtBottom(st, 4);
        System.out.println(st);

        System.out.println(
            
        );
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

    }
}
