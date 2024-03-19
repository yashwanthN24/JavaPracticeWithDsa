package BitManipulation;

public class FastExponentiation {
    public static int fastexpo(int a, int n) {
        //  consider 5^3 to solve this we do it as 5 * 5 * 5 that is 3 times 5 is multiplied 
        //  if 5^3 is assumed as a^n then this approach consumes 
        // O(n) time complexity so to make it O(log n ) we use the following approach 

        // Assume n (the power) is represented as binary with log n + 1 as max bits 
        // the approach is assign each bit of power  the mutiplicands a^(power of 2 )
        // 5^3 = 5^(011) so 1 bit corresponds to 5^1 and then 5^2 and 5^4 ... so on 

        // intialize ans to 1 
        int ans = 1;
        
        // traverse the lsb bit  of the number 
        // if it is set i.e (1) mutliply a ( the base ) with the answer 

        // for each iteration 
        // Change the value a to a*a to change the multiplicand for the next bit 
        // Right shift n by 1 bit to read the next lsb bit 
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans; 
    }

    public static void main(String[] args) {
        // Normally 3^4 takes 4 iteration multiplying 3 4 times 
        // but using fast exponentiaion 
        // the result occurs in log base 2(4) + 1 ; 
        // i.e 3 iteration hence an optimization 
        System.out.println(fastexpo(3 , 4 ));
    }
}
