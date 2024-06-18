import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(1);

        System.out.println(hs);

        System.out.println(hs.contains(2));
        System.out.println(hs.contains(21));
        // hs.clear();
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());

        
        @SuppressWarnings("rawtypes")
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println();

        for (Integer integer : hs) {
            System.out.println(integer);
        }
    }
}
