package Stack.RecentProblemsSolved;

import java.util.Stack;

public class SimplifyUnixStylePathQ {

    public static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

        StringBuilder result = new StringBuilder("");

        String directorynamesorOper[] = path.split("/");

        for (String dir : directorynamesorOper) {
            if (dir.equals("..") && !st.isEmpty()) {
                st.pop();
            } else if (!dir.equals("") && !dir.equals(".") && !dir.equals("..")) {
                st.push(dir);
            }
        }

        if (st.isEmpty()) {
            return "/";
        }

        while (!st.isEmpty()) {
            result.insert(0, st.pop()).insert(0, '/');
        }

        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/.../a/../b/c/../d/./"));
        System.out.println(simplifyPath("/../"));
        // empty stack exception so we pop only if we get ".." and only when
        // stack is not empty
    }
}
