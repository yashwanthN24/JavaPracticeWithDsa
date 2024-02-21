public class isprime {
    public static boolean isPrim(int n) {
        if (n == 1 || n == 0) {
            return false;
        } else if (n > 2) {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
            
            
        
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPrim(4));
    }
}
