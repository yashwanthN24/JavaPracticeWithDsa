package patterns.advancepatterns;

public class diamondpattern {
    public static void diamond(int n) {
        // 1st half 
        for (int i = 1; i <= n; i++) {
            // spaces = n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars = (2*i) -1 
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half 
        for (int i = n; i >= 1; i--) {
            // spaces = n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars = (2*i) -1 
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            if(!(i==1))
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(4);
    }
}
