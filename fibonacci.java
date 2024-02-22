import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, counter = 1; 
        while (counter <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            counter++;
        }
        sc.close();
    }
}
