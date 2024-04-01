package Recursion;

public class FriendsPairingProblem {
    public static int friendsPairing(int n) {
        // n friends 
        // Constraint Each friend can be paired only once 
        // base cases 
        // if n == 1 then he can be single so ways = 1 
        // if n == 2 then both of them can either be single or both can pair so ways = 2 
        
        if(n == 1 || n == 2 )
            return n; 

        // small work to be done is the choice that they would either be single or paired 
        // single 
        // ways for n-1 friends being single assuming we already made one person single 
        int fnm1 = friendsPairing(n - 1);

        // pair 
        // 1)now we shld first pair up two persons so 1 person can be paired with n-1 friends so we have n-1 ways to pair two person 
        // 2)Once we paired one pair now we need to pair remaining n-2 persons 
        // now from permutation and combination we use mutliplication theoram 
        // if u have a work done in one more works w1 , w2 then total work done is product (And) of all these work 
        // i.e W = w1 * w2 
        
        // so here as well we must first find the ways to pair up n friends followed pairing remaining n-2 friends recursively 

        // i.e first pair 2 friends then find the ways to pair remaining n-2 by calling f(n-2) (considering f(n) return the number of ways to pair n friends)
        int fnm2 = (n - 1) * friendsPairing(n - 2);

        // now total ways is sum of being single or a pair 
        int totalways = fnm1 + fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
