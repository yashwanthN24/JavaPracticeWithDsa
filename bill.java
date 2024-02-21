import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pen , paper and eraser");
        float c_p = sc.nextFloat();
        float c_penc = sc.nextFloat();
        float c_era = sc.nextFloat();
        float total = c_p + c_era + c_penc;
        total = total + total * 0.18f;
        System.out.println(total);
        sc.close();
        
    }
}
