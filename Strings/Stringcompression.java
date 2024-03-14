package Strings;

public class Stringcompression {
    public static String compressstr(String str) {
        // creating stringbuilder to directly return a mutated string  as final string 
        StringBuilder sb = new StringBuilder("");
        // iterate through all characters of the given string 
        for (int i = 0; i < str.length(); i++) {
            // for each iteration we see one character so count initialized to 1 
            // reason for using Integer reference type is because toString() method works
            // only for reference datatypes like classes only 
            Integer count = 1;
            // checking if we reached end of string and comparing each character with its next character
            // and increasing the count and moving on to next character as long as we dont reach the last charcter

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            // appending the characters when count is not greater than for cases like abcd 
            // where each character has only one occurence of itself 
            sb.append(str.charAt(i));
            // append the count along with the character if count is greater than 1 
            if (count > 1)
                sb.append(count.toString());
        }
        // finally return the string by converting stringbuilder object to string object 
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(compressstr("aaabbbbccdd"));
    }
}
