public class gcd {
    public static int gcd1(int m, int n) {
        if (m == 0 || n == 0)
            return -1;
        while (m != n) {
            if (m > n)
                m = m - n;
            else
                n = n - m;
        }
        return m;
    }
    public static void main(String[] args) {
        int m = 36, n = 24;
        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        System.out.println(m);
        System.out.println(gcd1(36, 24));
    }
}
