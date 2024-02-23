package Arrays.ArrayAlgorithms;

public class LinearsearchforString {

    public static void main(String[] args) {
        String snacks[] = { "burger", "coca cola", "samosa" };
        String key = "samosa";
        int index = linearsearch(snacks , key);
        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Key is found at index = " + index);
    }

    public static int linearsearch(String array[], String key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }

}
