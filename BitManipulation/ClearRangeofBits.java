package BitManipulation;


public class ClearRangeofBits {
    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int Bitmask = a | b;
        return n & Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(10 , 2 , 4));
    }
}
