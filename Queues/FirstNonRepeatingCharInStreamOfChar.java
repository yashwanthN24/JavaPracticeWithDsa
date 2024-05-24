package Queues;

import java.util.*;

public class FirstNonRepeatingCharInStreamOfChar {
    public static void getfirstnonrepeatingchar(String s) {
        // to track the count/frequency  of all 26  characters
        int frequency[] = new int[26];

        // queue to process the characters
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // add each character to queue 
            q.add(ch);
            // and increase its count/frequency/occurence
            frequency[ch - 'a']++;

            // if count > 1 remove from queue to find the first non repeating character
            while (!q.isEmpty() && frequency[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // if queue empty no first repeating character print -1 
            
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                // else character at front of queue is the first repeating charcater so just print q.peek()
                System.out.print(q.peek() + " ");
            }

        }
        

    }
    public static void main(String[] args) {
        String s = "aabccxb";
        getfirstnonrepeatingchar(s);
    }
}
