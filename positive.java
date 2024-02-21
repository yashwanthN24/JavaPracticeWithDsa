import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find positive or negative");
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println(n + " is positive");
        } else {
            System.out.println(n + " is negative ");
        }
        sc.close();
    }
    
}
