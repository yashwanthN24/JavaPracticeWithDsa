public class dectobinary {
    public static StringBuffer dectobin(int n) {
        String result = "";
        while (n != 0) {
            int ld = n % 2;
            result += ld;
            n = n / 2;
        }
        return new StringBuffer(result).reverse();
    }
    public static void main(String[] args) {
        System.out.println(dectobin(15));
    }
}
