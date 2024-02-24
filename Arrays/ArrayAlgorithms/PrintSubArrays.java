package Arrays.ArrayAlgorithms;

public class PrintSubArrays {
    public static void printsubarrays(int array[]) {
        int large_sum = Integer.MIN_VALUE , small_sum = Integer.MAX_VALUE ;
        // for each element in array
        for (int i = 0; i < array.length; i++) {
            // iterate all  elements that start from i element upto array.length-1 (starts with i not i+1 because we have to print the single subarray as well) 
            for (int j = i; j < array.length; j++) {
                //now print the subarray for each value of j we get diffeent subarray starting with i  so start = i and end = j 
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                    sum += array[k];
                }
                if (sum > large_sum)
                    large_sum = sum;
                if (sum < small_sum)
                    small_sum = sum;

                System.out.println();

            }
            // for min max sum of individual  subaarrays starting from i  
            // System.out.println("Max sum from above subarrays starting from " + array[i ]+" is " + large_sum);
            // System.out.println("Min sum from above subarrays starting from " + array[i]  + " is " + small_sum);
            // large_sum = Integer.MIN_VALUE;
            // small_sum = Integer.MAX_VALUE;
            System.out.println();
        }
        System.out.println("Max sum from above subarrays is " + large_sum);
            System.out.println("Min sum from above subarrays is " + small_sum);
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printsubarrays(numbers);

    }
}
