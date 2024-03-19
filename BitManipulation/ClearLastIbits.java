package BitManipulation;

public class ClearLastIbits {
    public static int clearLastIBits(int n, int i) {
        int BitMask = (-1) << i; // (~0) << i 
        return n & BitMask; 
    }
    public static void main(String[] args) {
        System.out.println(clearLastIBits(15, 2));
    }
}
