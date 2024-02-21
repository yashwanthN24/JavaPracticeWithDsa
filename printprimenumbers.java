public class printprimenumbers {
    public static boolean isprime(int n) {
        /* The reason we go up to the square root of n when checking if a number is prime is because of a mathematical property.
        To determine if a number n is prime,
        we only need to check if it is divisible by any number from 2 to the square root of n.
        If n is divisible by a number greater than its square root,
        then it must also be divisible by a number smaller than its square root.
        For example, let's say we want to check if 100 is a prime number.
        We only need to check if it is divisible by numbers from 2 to 10 (the square root of 100).
        If it is not divisible by any of these numbers, then it is not divisible by any number greater than 10 either. */
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void printprimeoutofgivenrange(int n) {
        for (int i = 2; i <= n; i++) {
            if(isprime(i))
                System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        printprimeoutofgivenrange(10);
    }
}
