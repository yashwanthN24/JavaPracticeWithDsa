package Recursion;

public class RecursionProblems {
    public static void printDesc(int n) {
        // handle base case while the recursion prints the n-1 numbers for you 
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        // print the nth number and let recursion print n-1 numbers 

        System.out.print(n + " ");
        printDesc(n - 1);
    }

    public static void printInc(int n) {
        // handle base case while the recursion prints n-1 numbers 
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        // print n-1 numbers first recursively recursion will do it 
        printInc(n - 1);
        // finally print nth number to complete the printing upto n numbers 
        System.out.print(n + " ");
    }
    
    public static int fact(int n) {
        // base case to handle 0! = 1 during the calculation of (n-1)!
        if (n == 0)
            return 1;
        // to find factorial of n i.e n! find (n-1)! first recursively and mutltiply with n 
        // as n! can be expressed always as n * (n-1)!
        int fnm1 = fact(n - 1);
        return n * fnm1;
    }
    
    public static int sumofn(int n) {
        // handle base case to provide sum as 1 when the number is 1 itself i.e  the sum is also 1 
        if (n == 1)
            return 1;
        // find n-1 numbers sum recursively 

        int snm1 = sumofn(n - 1);
        // finally add nth number to the n-1 numbers sum 
        return n + snm1;
    }
    
    public static int Nthfib(int n) {
        // base case to tell the first two terms of fibonacci series are 0 and 1 
        if(n == 0 || n== 1 )
            return n;
        // get n-2th Fib term recursively 
        int fibnm2 = Nthfib(n - 2);
        // get n-1th Fib term recursively 
        int fibnm1 = Nthfib(n - 1);
        // fib(n) = fib(n-1) + fib(n-2)
        return fibnm1 + fibnm2; 
    }

    public static void main(String[] args) {
        printDesc(5);
        System.out.println();
        printInc(5);

        System.out.println();

        System.out.println(fact(5));
        
        System.out.println(sumofn(5));

        System.out.println(Nthfib(5));
    }
}
