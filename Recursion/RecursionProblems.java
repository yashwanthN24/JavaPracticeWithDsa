package Recursion;

public class RecursionProblems {
    public static void printDesc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDesc(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }
    
    public static int fact(int n) {
        if (n == 0)
            return 1;
        int fnm1 = fact(n - 1);
        return n * fnm1;
    }
    
    public static int sumofn(int n) {
        if (n == 1)
            return 1;
        int snm1 = sumofn(n - 1);
        return n + snm1;
    }
    
    public static int Nthfib(int n) {
        if(n == 0 || n== 1 )
            return n;
        int fibnm2 = Nthfib(n - 2);
        int fibnm1 = Nthfib(n - 1);
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
