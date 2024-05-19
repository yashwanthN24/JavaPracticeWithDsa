package Stack;

import java.util.Stack;

public class MaximumRectangleAreaInHistogram {
    // 3 * O(n) => O(n) as constants are ignored  
    public static void getMaxAreaInHistogram(int arr[])  {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // next smaller right - O(n)
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.empty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = st.peek();
            }
            st.push(i);
        }
        
        // next smaller left - O(n)

        st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.empty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }
        
        // current Area  O(n)
        // width = j - i - 1 i.e nsr[i] - nsl[i] - 1 
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currentArea = width * height;
            maxArea = Math.max(maxArea, currentArea);
        }

        System.out.println("maximum Rectangular Area in histogram : " +  maxArea);
    }
    public static void main(String[] args) {
        // heights array 
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        getMaxAreaInHistogram(arr);
    }
}
