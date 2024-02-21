public class replace {

    public static String replacestr(String word, char lett, char thi) {
        char arr[] = word.toCharArray();
        int i = 0;
        for (char c : arr) {
            if (c == lett) {
                arr[i] = thi;
            }
            i++; 
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String result = replacestr("a happy", 'a', 'i');
        System.out.println(result);
    }
}
