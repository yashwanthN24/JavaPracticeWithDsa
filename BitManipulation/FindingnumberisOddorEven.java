package BitManipulation;

public class FindingnumberisOddorEven {
    public static String OddOrEven(int n) {
        // here we are Bitwise & (adding each bit with 1 ) so we get only lsb as set if its odd (1) and not set when even(0)
        // example consider 4 represented as 100 in binary 
        //  so 100 & 001 we get 000 which 0 so its even 
        // consider the case of 9 represented as 1001 
        // 1001 & 0001 then we get 0001  i.e 1 so its odd 

        // Inshort If lsb bit is 1 , then the number is odd 
        // if lsb bit is 0 , then the number is even 
        
        int lsbbit = n & 1;
        if (lsbbit == 0) {
            return n + " is even ";
        }
        return n + " is odd ";

    }
    public static void main(String[] args) {
        System.out.println(OddOrEven(3));
        System.out.println(OddOrEven(4));
        System.out.println(OddOrEven(9));
        System.out.println(OddOrEven(10));
    }
}
