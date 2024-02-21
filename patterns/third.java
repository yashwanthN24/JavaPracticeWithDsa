package patterns;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        for (int line = lines; line >= 1; line--) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
