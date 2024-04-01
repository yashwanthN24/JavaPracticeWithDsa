package Recursion.MorePracticeQuestions;

public class NumberTostring {

//You are given a number (eg - 2019), convert it into a String of english like
// “two zero one nine”. Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
// can’t be 0.

static String words[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

public static void  printNumberinenglish(int n) {
    if(n == 0 )
        return  ; 

    int lastdigit = n % 10;
    System.out.println(words[lastdigit] + " ");
    printNumberinenglish(n/10);
    }
    public static void main(String[] args) {
        printNumberinenglish(124445);
        
    }
}
