package Strings;

import java.util.Scanner;

public class IssuewithnextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // reads only till the number the enter character is read as nextLine so we read that \n by sc.nextLine() not by sc.next()
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(n);
        System.out.println(s);
    }
}
