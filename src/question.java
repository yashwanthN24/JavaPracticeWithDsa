import java.util.*;
public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n%10 != 0 ){
            System.out.println("Enter again:");
            n = sc.nextInt();

        }
    }
}
