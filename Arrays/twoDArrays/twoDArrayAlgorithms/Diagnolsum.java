package Arrays.twoDArrays.twoDArrayAlgorithms;

public class Diagnolsum {
    public static int printdiagnolsum(int array[][]) {
        int sum = 0;
        // O(n^2)
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < array[0].length; j++) {
        //         if (i == j)
        //             sum += array[i][j];
        //         else if (i + j == array.length - 1)
        //             sum += array[i][j];
        //     }
        // }
        // O(n)
        // Approach :
        // primary diagnol is same values i == j i.e [i][i]
        // secondary diagnol i + j = matrix.length - 1 
        //  j = matrix.length - 1 - i 
        // [i][matrix.length-1-i]
        
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
            if(i != array.length-1-i)
                sum += array[i][array.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1 , 2 , 4 },
            {2 , 3 , 6},
            {6 , 8 , 10}
        };
        System.out.println(printdiagnolsum(matrix));
    }
}
