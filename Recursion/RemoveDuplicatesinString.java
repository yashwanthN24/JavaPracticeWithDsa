package Recursion;

public class RemoveDuplicatesinString {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        // if idx == str.length print the string with no duplicates i.e newStr 
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // get current character 
        char currchar = str.charAt(idx);

        // check if currchar is a duplicate or not using the map array that return true or false whether an alphabet as already orccured or not 
        // 0th index of map array is for char 'a' 
        // to find the index of currchar we use the ascii value 
        // i.e currcharindex = currchar - 'a';
        // ex for 'a' index = 'a' - 'a' i.e 97 - 97 = 0 
        // we already created a map array of 26 length to correspond to each char occurence true or false 

        // checking if currchar is duplicate or not using currcharindex to map array 
        if (map[currchar - 'a'] == true) {
            // means the character has already occured (is a duplicate) so dont add to newStr(final str without duplicates ) and continue to nexr char
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            // means the character is not a duplicate so mark is as occured in map first and append it is nestr(final string) and continue to next character
            map[currchar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currchar), map);
        }

        
    }
    public static void main(String[] args) {
        String s = "appnnacollege";
        removeDuplicates(s, 0, new StringBuilder(""), new boolean[26]);
    }
}
