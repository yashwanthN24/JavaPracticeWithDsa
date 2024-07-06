package Tries;

public class PrefixProblem {
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
    
    public static void findPrefix(Node root, String ans) {
        // Time complexity TC : O(L) where L is the length of longest word in the Trie 

        // Given Array of Strings or ArrayList of Strings and any search operation like find prefix suffix we use Tries always 
        // for such questions As they provide optimized approach 



        if (root == null) {
            return;
        }

        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < root.children.length; i++) {
            findPrefix(root.children[i], ans + (char)(i+'a'));
        }
    }


    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" };


        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        root.freq = -1;

        findPrefix(root, "");

        // we get output in alphabeticall order of prefixes because In trie words as stored in alphabetical order 
        // remember a-z children array 
        

    }
}
