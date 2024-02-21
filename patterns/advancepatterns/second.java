package patterns.advancepatterns;

public class second {
    public static void main(String[] args) {
        int k;
        int l = 3;
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for ( k = 3; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - l; j++) {
                System.out.print("*");
            }
            l--;
            System.out.println();
        }
    }
}
