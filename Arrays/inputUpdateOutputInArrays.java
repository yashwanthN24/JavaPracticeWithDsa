package Arrays;

import java.util.Scanner;

public class inputUpdateOutputInArrays {
    public static void main(String[] args) {
        int marks[] = new int[50];
        System.out.println(marks.length);

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//chem

        marks[2] = sc.nextInt();//math
        System.out.println("Phy : " + marks[0]);
        System.out.println("Chem : " + marks[1]);
        System.out.println("Math : " + marks[2]);

        marks[2] = marks[2] + 1;
        System.out.println("Math :" + marks[2]);
        int average = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Average : " + average);
        sc.close();
    }
}
