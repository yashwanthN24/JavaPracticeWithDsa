package patterns.advancepatterns;

public class aapatern {
    public static void aapaterns(int n) {
        // 1st half 
        for (int i = 1; i <= n; i++) {
            // space = n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // a's upto (2*i)-1 if j is odd print a else space 
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 0)
                    System.out.print(" ");
                else
                    System.out.print("a");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n-1; i >= 1; i--) {
            // space = n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // a's upto (2*i)-1 if j is odd print a else space 
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 0)
                    System.out.print(" ");
                else
                    System.out.print("a");
            }
            if(!(i==1))
            System.out.println();
        }
    }
    public static void main(String[] args) {
        aapaterns(4);
    }
}
