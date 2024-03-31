package Recursion;


public class xpowern {
    public static int xn(int x, int n, int ans) {
        // this is a bit Manipulation approach 
        // if the power n becomes 0 return the ans 
        if (n == 0)
            return ans;
        // get the lsb bit of power i.e n if it is 1 then multiply the base to the result (initialized to 1 initially)
        if ((n & 1) != 0) {
            ans = ans * x;
        }
        // for next iteration right shift the power (n) to get the next lsb and mutliply  the base to act as mulitplican for the next bit 
        // consider 5^3  her 3 is 011 in binary so our approach is associating the multiplicand 5^1 , 5^2 i.e Base^1 , Base^2 ... from right to left 
        // so   011
        // 5^3  5^2 5^1
        // so the result is 1*25 * 1*5 = 125 which is the result 
        // we get the log base 2 (n ) + 1 calls so time complexity of O(log n ) is achieved 

        return xn(x * x, n >> 1, ans);
    }
    
    public static int normalxn(int x, int n) {
        // normal approach o(n)
        if (n == 0)
            return 1;
        return x * normalxn(x, n - 1);
    }
    

    public static int optimizedxn(int x, int n) {
        // consider 2^10  n = 10 
        // if n is even then x^n = x^n/2  * x^n/2  
        // if n is odd then x^n = x * x^n/2 * x^n/2 
        // hence each time we are dividing the power by half 
        // so we get log base 2 of n calls hence 
        // time complexity = o(log n ) and space complexity also o(log n)
        

        // base case if x^0 = 1  so if n == 0 return 1 
        if(n == 0 )
            return 1; 
        // find x^n/2 
        int halfpower = optimizedxn(x, n / 2);
        // for n is even case 
        if (n % 2 == 0) {
            return halfpower * halfpower;
        }
        // else obviously it is odd 
        return x * halfpower * halfpower;
        
    }
    public static void main(String[] args) {
        System.out.println(xn(5 ,4, 1 ));
        System.out.println(normalxn(5, 4));
        
        System.out.println(optimizedxn(5, 3));
    }
}
