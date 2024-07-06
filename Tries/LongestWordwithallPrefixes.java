package Tries;

public class LongestWordwithallPrefixes {

    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;

            }
            freq = 1;

        }

    }

    public static Node root = new Node();


    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }


    public static String ans = "";


    public static void longestword(Node root, StringBuilder temp) {
        if(root == null)
            return;

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestword(root.children[i], temp);

                temp.deleteCharAt(temp.length() - 1);
            }
            
            // for printing lexographically larger one just chnage the for loop to iterate from i = 25 to 0  then we would gey apply instead of apple 
            
        }
    }

    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };

        // create Trie for these words in words array 

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        longestword(root, new StringBuilder(""));
        System.out.println(ans);

    }
}
