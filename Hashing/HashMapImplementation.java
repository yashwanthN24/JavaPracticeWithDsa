import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImplementation {

    static class HashMap<K, V> {
        // This class contains Nodes to store key valued pairs 
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        
        private int n; // n is the total number of nodes in the map 

        private int N; // bucket size 
        private LinkedList<Node> buckets[]; // N = buckets.length


        // This has to put because when we create array of linkedlist the type must also be specified to prevent type check we add this 

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }


        
        private int hashFunction(K key) {

            // hashcode gives a hased code 
            int hc = key.hashCode();

            // that code should be between 0 to N-1 so we % with N 
            return Math.abs(hc) % N;
        }
        
        private int searchinLL(K key, int bi) {
            // We fetch the linkedList in given BucketIndex 
            LinkedList<Node> ll = buckets[bi];

            // we iterate through the linkedlist and find the data index (matched index)
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {

                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }

            // if not found return -1 
            return -1;
        }
        
        @SuppressWarnings("unchecked")
        private void rehash() {
            //array doubling of buckets array 

            // storing current bucket into oldBucket reference variable 
            LinkedList<Node> oldBucket[] = buckets;

            // and creating new Bucket of N*2 (doubling of size)
            buckets = new LinkedList[N * 2];
            N = 2 * N;

            
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }


            // transfer all nodes from oldbucket and put them in buckets 
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];

                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        

        public void put(K key, V value) { // TC: O(lameda) => O(1)
            // find out bucket index for key K through hashFunction 
            int bi = hashFunction(key);

            // get data index (di) in bucket with index as bi 
            int di = searchinLL(key, bi);

            // if valid data index found we just need to update the nodes value 
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                // if data index is invalid then that key valued pair is not present so we need to add it 

                buckets[bi].add(new Node(key, value)); // adding to end of linkedlist 
                n++; // incrementing the number of nodes in hashmap

            }

            // checking lameda < threshold value (assumed here as 2.0)  if not we rehash

            double lameda = (double) n / N;


            // if lameda > thresholdvalue i.e k 
            // then we rehash 
            if (lameda > 2.0) {
                rehash();
            }

        }
        
        public boolean containsKey(K key) { // O(1)
            // find out bucket index for key K through hashFunction 
            int bi = hashFunction(key);

            // get data index (di) in bucket with index as bi 
            int di = searchinLL(key, bi);

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V get(K key) { // TC : O(1)
            // find out bucket index for key K through hashFunction 
            int bi = hashFunction(key);

            // get data index (di) in bucket with index as bi 
            int di = searchinLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public V remove(K key) { // O(1)
            // find out bucket index for key K through hashFunction 
            int bi = hashFunction(key);

            // get data index (di) in bucket with index as bi 
            int di = searchinLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> al = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    al.add(node.key);
                }
            }
            return al;
        }
        
        public boolean isEmpty() {
            // if total nodes in hashmap = 0 then isEmpty returns true else false 
            return n == 0;
        }

    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Bhutan", 2);
        hm.put("US", 59);


        ArrayList<String> keys = hm.keySet();
        for (String string : keys) {
            System.out.println(string);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
