package Arrays.twoDArrays.twoDArrayAlgorithms.practiceQuestions;

public class transpose {
    public static int[][] gettranspose(int arr[][]) {
        int transpose[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }

    public static void printmatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = { 
            {1 , 2 ,3},
            {1 , 2 , 4}
        };
        printmatrix(matrix);
        int transpose[][] = gettranspose(matrix);
        printmatrix(transpose);
    }
}
