package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isvalidparethesis(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            // current character (bracket)
            char ch = s.charAt(i);

            // opening bracket case
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else {

                if (st.empty()) {
                    return false; 
                }
                // closing bracket case 
                if ((st.peek() == '(' && ch == ')') || st.peek() == '[' && ch == ']' || st.peek() == '{' && ch == '}') {
                    st.pop();
                } else {
                    // no match invalid string 
                    return false;
                }
            }
        }

        if (st.empty()) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isvalidparethesis(s));
    }
}
