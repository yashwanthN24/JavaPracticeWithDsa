package DP_Dynamic_Programming;

public class fibonacciRecursion {

    public static int Dp_fib(int n, int f[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {

            return f[n];
        }

        // f[n] = fib(n - 1) + fib(n - 2);
        // return f[n];

        return f[n] = fib(n - 1) + fib(n - 2);
        // this will first call fib(n-1 ) then fib(n-2) and stores the result in f[n]
        // and that value in f[n] is returned

    }

    public static int fib(int n) {
        if (n == 0 || n == 1) { // 0 1 1 2 3 5 8 , first element is 0th term ...
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
        // this takes 2^n as it creates a full binary recursion tree of calls (having
        // redundant calls )
        int n = 4;
        System.out.println(Dp_fib(n, new int[n + 1]));
        // this take O(n) as it reduces it to a skewed trees and calls are
        // made only for one side other side calls are not made rather
        // retrieved from calculated result O(1)

    }

    // but redundant calls of f(2) and f(1) multiple times leading to increased time
    // complexity more operations (calls)

    // one method of dynamic programming is to use memorization that is to store the
    // obtained results so that the calucated result can be directly rather than
    // calling them again for calculation

}
