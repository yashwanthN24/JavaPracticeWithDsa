package Arrays.ArrayAlgorithms;
public class Linearsearch {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        int index = linearsearch(numbers, key);
        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Key is found at index = " + index);
    }
    
    public static int linearsearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;

        }
        return -1; 
    }
}