public class bintodecimal {
    public static int  bintodec(int n) {
        int i = 0, decimal=0;
        while (n != 0) {
            int lastdigit = n % 10;
            decimal = decimal +  (lastdigit * (int) Math.pow(2, i));
            n = n / 10;
            i++;
        }
        return  decimal;
    }
    public static void main(String[] args) {
        System.out.println(bintodec(1111));
    }
}
