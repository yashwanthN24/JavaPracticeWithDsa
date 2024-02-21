import java.util.Scanner;

/**
 * average
 */
public class average {
    static Scanner sc = new Scanner(System.in);

    public static float getfloatinput() {
        return sc.nextFloat();
    }

    public static void main(String[] args) {
        float a, b, c, sum = 0, avg;
        System.out.println("Enter 3 numbers :");
        a= getfloatinput();
        b=getfloatinput();
        c = getfloatinput();
        sum = a + b + c;
        avg = sum / 3;
        System.out.println(sum + " " + avg);
    }
}