import java.util.Scanner;

import static java.lang.Math.sqrt;

public class mathclass {
    public static void main(String[] args) {
//        double b = 25 ;
        double sq = sqrt(25);
        System.out.println(sq);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter perpendicular :");
        double d = sc.nextDouble();
        System.out.println("Enter base :");
        double b = sc.nextDouble();
        double h = sqrt((d*d) + (b*b));
        System.out.println("Hypotuese is :"  + h);
    }
}
