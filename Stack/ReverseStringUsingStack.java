package Stack;

import java.util.Stack;

public class ReverseStringUsingStack {

    public static String reverseString(String str){
        Stack<Character> st = new Stack<>();

        // push all characters of given string in stack 
        int index = 0 ; 
        while(index < str.length()){
            st.push(str.charAt(index));
            index++;
        }

        // pop all characters and add to stringBuilder or string and return it 
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s);
        String res = reverseString(s);
        System.out.println(res);
    }
}
