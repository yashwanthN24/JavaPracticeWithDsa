package patterns.advancepatterns;

public class seven {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j)
                    System.out.print("1");
                else
                    System.out.print("0");

            }
            System.out.println();
        }
    }
}
