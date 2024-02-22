package patterns.advancepatterns;

public class numberpatternadvance {
    public static void printNum(int n) {
        // 1st half 
        for (int i = 1; i <= n; i++) {
            // space = n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers 
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (j <= i)
                    System.out.print(j);
                else
                    System.out.print(i*2-j);
                
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            //spaces 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //numbers
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if ( j<=i)
                    System.out.print(j);
                else
                    System.out.print(i*2-j);
            }
            if(!(i==1))
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printNum(4);
    }
}
