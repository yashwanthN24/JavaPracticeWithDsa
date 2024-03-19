package BitManipulation;

public class GettingIthBit {
    public static int GetIthBit(int n, int i) {
        // we are left shift upto the ith bit and  & it with the n to get the bit at ith position 
        // if the bit is 0 we get the result of (n & (1 << i))  as 0 
        // if the bit is 1 we get a non-zero result of (n & (1 << i)) 
        if((n & (1 << i )) == 0)
            return 0;
        else 
            return 1; 
    }
    public static void main(String[] args) {
        System.out.println(GetIthBit(10 , 3));
    }
}
