package patterns;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();
        for (int line = 1; line <= lines; line++) {
            for (int star = lines; star >= line; star--) {
                System.out.print("*");
                
            }
            System.out.println();
        }

    }
}
