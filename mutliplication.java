import java.util.Scanner;

public class mutliplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want mutliplication table of : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.println(n + " X " + i + " =" + n * i);
        }


    }
}
