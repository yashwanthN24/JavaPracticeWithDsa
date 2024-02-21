package patterns;

import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        for (char i = 'A'; i <= 'Z'; i++) {
            for (char ch = 'A'; ch <= i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
