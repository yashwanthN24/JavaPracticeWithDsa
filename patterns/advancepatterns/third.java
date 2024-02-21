package patterns.advancepatterns;

public class third {
    public static void main(String[] args) {
        // int k = 5;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // k--;
            System.out.println();
        }
    }
}
