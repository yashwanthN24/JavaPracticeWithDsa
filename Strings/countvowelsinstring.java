package Strings;

public class countvowelsinstring {
    public static void main(String[] args) {
        String str = "ahdheuishsho";
        int vcount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vcount++;
            }
        }
        System.out.println("the vowels present are in total :" + vcount);
    }
}
