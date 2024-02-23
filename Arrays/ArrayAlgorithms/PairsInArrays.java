package Arrays.ArrayAlgorithms;

public class PairsInArrays {
    public static void printpairs(int array[]) {
        // if you want to find the totalpair
        int totalpair = 0;
        // for each element of array i.e
        for (int i = 0; i < array.length; i++) {
            // iterate all the remaining elements i.e if cuurent element is i then from i+1
            // to end of array
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + " , " + array[j] + ")" + " ");
                totalpair++;
            }
            if (!(i == array.length - 1))
                System.out.println();
        }
        // Note : Total pairs possible for n array size if n(n-1)/2
        System.out.print(totalpair);
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        printpairs(array);
    }
}
