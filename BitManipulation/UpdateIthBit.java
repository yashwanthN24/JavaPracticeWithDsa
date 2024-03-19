package BitManipulation;

public class UpdateIthBit {
    public static int updateIthBit(int n, int i, int newBit) {
        // problem statement is to updatebit of n  at index i to the newBit (0|1)
        n = n & ~(1 << i); //  that is clear the bit first in any case
        // so n contains the ith bit cleared 
        int bitmask = newBit << i;
        return n | bitmask;
        
        // or 
        // if(newbit == 0 )
        // clearIthbit(n , i);
        // else 
        // setIthBit(n , i );
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10 , 2 , 1));
    }
}
