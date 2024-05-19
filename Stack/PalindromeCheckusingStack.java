package Stack;

import java.util.Stack;

public class PalindromeCheckusingStack {
    public static boolean ispali(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length() / 2; i++) {
            st.push(s.charAt(i));
        }

        int secondhalfindex = s.length() - s.length() / 2;
        for (int i = secondhalfindex; i < s.length(); i++) {
            if (st.peek() != s.charAt(i)) {
                return false;
            }
            st.pop();
        }
        
        return true;
        
    }
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(ispali(s));
    }
}
