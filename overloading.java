public class overloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b; 
    }
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        float res = sum(3.4f, 2.3f);
        System.out.println(res);
    }
}
