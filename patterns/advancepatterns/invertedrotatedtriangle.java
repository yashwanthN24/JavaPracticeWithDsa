package patterns.advancepatterns;

public class invertedrotatedtriangle {
    public static void invertedtriangle(int row , int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            if(!(i== row))
                System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedtriangle(4, 4);
    }
}
