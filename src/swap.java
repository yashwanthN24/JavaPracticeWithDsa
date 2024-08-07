public class swap {
    public static void main(String[] args) {
        String a = "water";
        String b = "fire";
        String temp ;
        temp = a ;
        a = b ;
        b = temp ;
        System.out.println(a  +  " " +  b  + " " + temp);
        // to print hascode of an object
        System.out.println(a.hashCode());
    }
}
