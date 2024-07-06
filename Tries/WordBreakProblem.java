package Tries;

public class WordBreakProblem {
    
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

    public static boolean wordbreak(String key) {
        
        if (key.length() == 0) {
            return true;
        }

        // substring(0 , i) search in trie and call for rest half wordbreak(substring(i))
        // if both return true we return true else false 
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordbreak(key.substring(i))) {
                return true;
            }

            
        }
        return false;
    }
    
    public static void main(String[] args) {
        // Time complexity: O(L) where L is length of key

        String arr[] = { "i", "like", "sam", "samsung", "mobile", "ice" };

        // insert each string in arr to a trie 

        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        // key 
        String key = "ilikesamsung";


        System.out.println(wordbreak(key));

        System.out.println(wordbreak("ilikesung"));
    }
}
