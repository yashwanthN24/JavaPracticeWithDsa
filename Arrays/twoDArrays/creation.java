package Arrays.twoDArrays;
import java.util.*;

public class creation {
    public static int getlargeandsmall(int matrix[][]) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                largest = Math.max(largest, matrix[i][j]);
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        System.out.println("Smallest is :" + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        //  n denotes number of rows or number of 1D arrays 
        int n = matrix.length;
        // m - denotes number of columns or the no of values in each 1D array
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        // reading input into 2D Array 
        // iterate through each 1D array fill in the values into them then move onto next 1D array 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // output 2D array elements 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // finding largest and smallest in 2d Array 
        System.out.println(getlargeandsmall(matrix));
        sc.close();
        
    }
}
