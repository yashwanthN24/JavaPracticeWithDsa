import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = (int)sc.nextFloat();
        System.out.println("The area of a square with side " + side + " is " + (side * side));
        sc.close();
    }
}
