public class dectobinary2 {
    public static int dectobin(int n) {
        int pow = 0, bin = 0;
        while (n != 0) {
            int rem = n % 2;
            bin = bin + rem * (int) Math.pow(10, pow);
            n = n / 2;
            pow++;
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(dectobin(7));
    }
}
