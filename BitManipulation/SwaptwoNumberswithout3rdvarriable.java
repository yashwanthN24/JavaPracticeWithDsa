package BitManipulation;

public class SwaptwoNumberswithout3rdvarriable {
    
    public static void main(String[] args) {
        int x = 3, y = 4;
        System.out.println("Before Swap x: " + x + " and y = " + y);
        x = x ^ y; // x = x + y 
        y = x ^ y; // y = x - y 
        x = x ^ y; // x = x - y 
        System.out.println("After Swap x: " + x + " and y = " + y);
    }
}
