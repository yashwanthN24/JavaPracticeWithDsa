import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Noida");
        hs.add("Bangalore");
    

        System.out.println(hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bangalore");

        System.out.println(lhs);
        lhs.remove("Mumbai");
        System.out.println(lhs);
    
    }
}
