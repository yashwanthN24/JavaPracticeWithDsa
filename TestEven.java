public class TestEven {
    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static void printEveninrange(int n) {
        for (int i = 2; i <= n; i++) {
            if(isEven(i))
                System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        printEveninrange(10);
    }
}
