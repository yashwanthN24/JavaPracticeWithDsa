package patterns.advancepatterns;

public class numberpattern {
    public static void printpattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            if(i!=n)
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printpattern(9);
    }
    
}
