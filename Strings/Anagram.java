package Strings;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean checkAnagram(String str1, String str2) {
        // convert both the strings to lowercase so that we handle the case for both upper and lowercase Strings
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // check the length if not same not an anagram
        if (str1.length() != str2.length()) {
            return false;
        } else {
            // if length same convert the strings to into charArrays
            // sort both the array and compare and return true if they are equal
            char chararry1[] = str1.toCharArray();
            char chararry2[] = str2.toCharArray();
            Arrays.sort(chararry1);
            Arrays.sort(chararry2);
            if (Arrays.equals(chararry1, chararry2)) {
                return true;
            }
            return false; 
        }
    }
    public static void main(String[] args) {
        // read two Strings 
        System.out.println("Enter twos Strings");
        System.out.println("Enter String 1 :");
        String str1 = new Scanner(System.in).next();
        System.out.println("Enter String 2 :");
        String str2 = new Scanner(System.in).next();
        System.out.println(checkAnagram(str1 , str2));
    }
}
