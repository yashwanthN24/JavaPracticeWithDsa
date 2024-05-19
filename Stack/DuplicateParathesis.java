package Stack;

import java.util.Stack;

public class DuplicateParathesis {

    public static boolean checkDuplicateParathesis(String s) {
        // create a stack to track the closing and opening brackets so a stack of characters 
        Stack<Character> st = new Stack<>();

        // iterate through each character of the expressing String s 
        for (char c : s.toCharArray()) {
            // closing bracket case 
            if (c == ')') {
                int count = 0; // to have count of items inside the pair ()
                while (st.pop() != '(') {
                    // st.pop();
                    count++;
                }
                if (count < 1) {// if count = 0 then no items in () so duplicate parenthesis 
                    return true; // duplicate parenthesis exists
                } //else {
                    // st.pop(); // to remove that '(' that stopped while loop at 
                // }
            }
            // opening bracket or operand or operator push into stack
            else {
                st.push(c);
            }

        }

        return false; 
    }

    public static void main(String[] args) {
        String s = "((a+b))";
        String str = "(a+b)";
        System.out.println(checkDuplicateParathesis(s));
        System.out.println(checkDuplicateParathesis(str));
    }
}