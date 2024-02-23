package Arrays;

public class Creation {
    public static void main(String[] args) {
        int marks[] = new int[50];
        char symbols[] = new char[50];
        // size of array defined during creation intialized with default value null for strings
        String words[] = new String[34];
        System.out.println(words[0]);
        System.out.println(symbols[0]);
        System.out.println(marks[0]);
        // size of array is calculated dynamically 
        int numbers[] = { 1, 2, 4, 5, 5 };
        System.out.println(numbers.length);
        // defining and intializing at the same time
        int anothernum[] = new int[] { 2, 4, 5, 6 };
        System.out.println(anothernum.length);
        //string array 
        String fruits[] = { "apple", "mango", "banana" };
        System.out.println(fruits);
        System.out.println(fruits.length);
    }
}
