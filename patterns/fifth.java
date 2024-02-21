package patterns;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int n = sc.nextInt();
        sc.close();
        for (int line = 1; line <= n; line++) {
            for (int symbol = 1; symbol <= line; symbol++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    
}
