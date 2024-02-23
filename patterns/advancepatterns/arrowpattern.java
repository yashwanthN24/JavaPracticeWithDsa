package patterns.advancepatterns;

public class arrowpattern {
    public static void printarrowpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            if(!(i==1))
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printarrowpattern(4);
    }
}
