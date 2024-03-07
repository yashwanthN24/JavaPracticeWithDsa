package Arrays.twoDArrays.twoDArrayAlgorithms;

public class searchinsortedarray {
    public static void startcasesearch(int arr[][], int key) {
        int row = arr.length - 1, col = 0;
        while (col < arr.length && row >= 0) {
            if (arr[row][col] == key) {
                System.out.println("found at position" + row + " " + col);
                return;
            } else if (key < arr[row][col]) {
                row--;
            } else {
                col++;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        // here array is both row and column sorted 
        //  can start from (array.lengh-1 , 0) element or (0 , array.length-1) element
        
        startcasesearch(matrix, 40);
    }
}
