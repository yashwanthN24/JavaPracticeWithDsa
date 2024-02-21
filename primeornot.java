import java.util.Scanner;
import static java.lang.Math.sqrt;
public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num == 1) {
            System.out.println("1 is neither prime nor composite.");
            System.exit(0);
        }
        for (int i = 2; i <=sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
    }
}
