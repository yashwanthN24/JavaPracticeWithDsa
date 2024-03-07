package Arrays.twoDArrays.twoDArrayAlgorithms;

public class SpiralMatrix {
    public static void printSpiralMatrix(int array[][]) {
        int startrow = 0, startcol = 0, endrow = array.length-1, endcol = array[0].length-1;
        while (startrow <= endrow && startcol <= endcol) {
            // top print 
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(array[startrow][j] + " ");

            }
            // right print 
            for (int j = startrow + 1; j <= endrow; j++) {
                System.out.print(array[j][endcol] + " ");
            }
            // bottom print {
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow)
                    break;
                System.out.print(array[endrow][j] + " ");
            }
            // left print 
            for (int j = endrow - 1; j >= startrow + 1; j--) {
                if (startcol == endcol)
                    break;
                System.out.print(array[j][startcol] + " ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;

        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1 , 2 , 3 },
            {5 , 6 , 7  },
            {9 , 10 , 11 },
            {13, 14 , 15 }
        };
        printSpiralMatrix(matrix);
    }
}
