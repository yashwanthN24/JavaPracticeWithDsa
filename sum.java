import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        int arr[] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some integers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int se = 0, so = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                se += i;
            } else {
                so += i;
            }
        }
        System.out.println("Sum of even numbers: " + se);
        System.out.println("Sum of odd numbers: " + so);
    }
}