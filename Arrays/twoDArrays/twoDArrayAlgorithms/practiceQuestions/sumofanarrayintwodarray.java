package Arrays.twoDArrays.twoDArrayAlgorithms.practiceQuestions;

import Arrays.inputUpdateOutputInArrays;
import Arrays.ArrayAlgorithms.reversingAnArray;

public class sumofanarrayintwodarray {
    public static int sumof(int arr[][]) {
        int sum = 0  , j= 0;

        for (int i = 0; i < arr[1].length; i++) {
            sum += arr[1][i];
            if(i != arr.length-1)
                j++;
        }
        return sum; 
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };
        System.out.println(sumof(matrix));
    }
}
