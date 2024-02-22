public class Palindromecheck {
    public static boolean isPali(int n) {
        int rev = 0, num = n;
        while (n != 0) {
            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n /= 10;
        }
        if(rev == num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPali(121));
        System.out.println(isPali(12231));
    }
}
