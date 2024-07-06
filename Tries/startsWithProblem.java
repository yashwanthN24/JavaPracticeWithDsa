package Tries;



public class startsWithProblem {
    
    static class Node {
        Node children[] = new Node[26];
        boolean endofWord = false;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            // This is not required as bydefault Node array intialized with null values 
        }

    }

    public static Node root = new Node();

    // In trie each word has level or (height) == its length
    public static void insert(String word) {
        // TC : O(L) where L is the length of String 

        Node cur = root;

        for (int level = 0; level < word.length(); level++) {
            char ch = word.charAt(level);
            if (cur.children[ch - 'a'] == null) {
                cur.children[ch - 'a'] = new Node();
            }

            cur = cur.children[ch - 'a'];
        }
        cur.endofWord = true;
    }

    public static boolean search(String key) {
        // Time complexity = O(L) where L is the length of the key ur searching for

        Node curr = root;

        for (int level = 0; level < key.length(); level++) {
            char ch = key.charAt(level);

            if (curr.children[ch - 'a'] == null) {
                return false;
            }

            curr = curr.children[ch - 'a'];
        }

        return curr.endofWord == true;// or return curr.endofWord ;
    }
    

    public static boolean startswith(String prefix) {
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }
    
    public static void main(String[] args) {
        
        String words[] = { "apple", "app", "mango", "man", "woman" };


        String prefix1 = "app";
        String prefix2 = "moon";

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(startswith(prefix1)); // true 
        System.out.println(startswith(prefix2));// false

    }
    
}