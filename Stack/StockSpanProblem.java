package Stack;

import java.util.Stack;

public class StockSpanProblem {

    public static void stockspan(int stocks[], int span[]) {
        // create a stack 
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currprice = stocks[i];
            while (!st.isEmpty() && currprice > stocks[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevhigh = st.peek();
                span[i] = i - prevhigh;
            }
            st.push(i);

        }

    }
    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockspan(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }


    }
}
