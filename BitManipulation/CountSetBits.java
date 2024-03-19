package BitManipulation;

public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        // checking Lsb bit each time by bitmasking with 00001 always 
        //  if bit is 1 increment else 
        // just right shift the number to check the next lsb 
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(15));
    }
}
