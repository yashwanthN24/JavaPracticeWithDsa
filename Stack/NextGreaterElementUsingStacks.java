package Stack;

import java.util.Stack;

public class NextGreaterElementUsingStacks {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };

        Stack<Integer> s = new Stack<>();

        int nextGreater[] = new int[arr.length];

        // time complexity - O(n)
        for (int i = arr.length - 1; i >= 0; i--) {

            // while loop - to remove indexes of smallest elements than current element towards right 
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // if - else 
            if (s.isEmpty()) {
                // nextgreater is nothing -1 
                nextGreater[i] = -1;
            } else {
                // nextgreater is element at index present on top of stack
                nextGreater[i] = arr[s.peek()];
            }

            // push onto stack current element index 
            s.push(i);
        }
        // print nextgreater array 
        for (int i : nextGreater) {
            System.out.print(i + " ");
        }
    }
}

    
//next greatest - right side  is the above code 

// other variations are 
// next greatest - left side then change for loop iterate from 0 to n-1 
// next smallest - right side then change the condition in while loop to >= 
/*  next smallest - left side then change for loop iterate from 0 to n-1 
    and while condition to >= */
    

