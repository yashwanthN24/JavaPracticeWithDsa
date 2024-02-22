public class reverseastring {
    public static String reverse(String input) {
        char word[] = input.toCharArray();
        int start = 0, end = word.length - 1;
        while (start < end) {
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            start++;
            end--;
        }
        return new String(word);
    }
    public static void main(String[] args) {
        System.out.println(reverse("yash"));
    }
}
