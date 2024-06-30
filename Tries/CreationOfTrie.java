package Tries;

public class CreationOfTrie {

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

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }


        System.out.println(search("thee"));
        System.out.println(search("thor"));

        System.out.println(search("any"));
        System.out.println(search("an"));

        System.out.println(search("yash"));
    }
}
