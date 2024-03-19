package BitManipulation;

public class ModularExponentiation {
    public static int  ModularExpo(int a , int n , int p ){
        //  so we want to find (a^n) % p in the fastest way possible 
        //  so we use fastexponetiation to find a^n 
        //  with that result we perform % with p and return the final result 
        return FastExponentiation.fastexpo(a, n) % p ;
    }
    public static void main(String[] args) {
        System.out.println(ModularExpo(2, 5, 13));
    }
}
