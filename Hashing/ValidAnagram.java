import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s1, String s2) {
        // Time complexity : O(n) where n is the length of the strings s1 and s2 

        // If length not same they are not anagrams so return false directly
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // if length same we check if same characters used in both strings 

        // we make use of a hashMap to store the mapping of each character and its occurence count of string s1 
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // we traverse string s2 and check if that character is present in map if present we decrease its frequency 
        // when its frequency is 0 we remove it

        // when unmatched character is found that is not present in hashmap then we return false 
        // as both are not having the same characters 

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }

            } else {
                return false;
            }
        }


        // finally if our map is empty both string are anagram else not anagram
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        System.out.println(isAnagram(s1 , s2));
    }
}
