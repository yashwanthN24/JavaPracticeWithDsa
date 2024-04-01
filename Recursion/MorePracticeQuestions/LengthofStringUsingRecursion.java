package Recursion.MorePracticeQuestions;

public class LengthofStringUsingRecursion {
    public static int lenofStr(String str) {

        if (str.length() == 0)
            return 0 ;
        return 1 + lenofStr(str.substring(1));

    }

    public static void main(String[] args) {
        System.out.println(lenofStr("yash"));
    }
}
