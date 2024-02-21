import java.util.Scanner;

public class Binomialcoefficient {

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int bc(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n and r values for ncr calculation:");
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(!(r > n))
            System.out.println(bc(n, r));
        else
            System.out.println("Invalid input");
    }
}
