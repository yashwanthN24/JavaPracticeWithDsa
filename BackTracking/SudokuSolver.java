package BackTracking;

public class SudokuSolver {

    public static boolean sudokusolver(int sudoku[][], int row, int col) {
        // base case 
        if (row == 9)
            return true;

        // recursion - work to be done 
        int newrow = row, newcol = col + 1;
        if (col + 1 == 9) {
            newrow = row + 1;
            newcol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokusolver(sudoku, newrow, newcol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (issafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokusolver(sudoku, newrow, newcol))
                    return true;
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    public static boolean issafe(int sudoku[][], int row, int col, int digit) {

        // checking if that digit is present in column 
        for (int j = 0; j < sudoku.length; j++) {
            if (sudoku[j][col] == digit) {
                return false;
            }
        }

        // checking if that digit is present in the same row 
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[row][i] == digit)
                return false;
        }
        
        // checking if digit present in the same 3 X 3 Grid 
        int sr = (row / 3) * 3; // to get the starting row of the grid 
        int sc = (col / 3) * 3; // to get the starting col of the grid 
        // iterating the 3 X 3  grid elements 
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit)
                    return false;
            }
        }

        

        return true;
    }
    
    
    public static void printsudoku(int sudoku[][]) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {
            {0 , 0 , 8 , 0 , 0 , 0 , 0 , 0 , 0},
            {4 , 9 , 0 , 1 , 5 , 7 , 0 , 0 , 2 },
            {0 , 0 , 3 , 0 , 0 , 4 , 1 , 9 , 0},
            {1 , 8 , 5 , 0 , 6 , 0 , 0 , 2 , 0},
            {0 , 0 , 0 , 0 , 2 , 0 , 0 , 6 , 0 },
            {9 , 6 , 0 , 4 , 0 , 5 , 3, 0 , 0 },
            {0 , 3, 0 , 0 , 7 , 2 , 0 , 0 , 4 },
            {0 , 4 , 9 , 0 , 3, 0 , 0 , 5 , 7},
            {8 , 2 , 7 , 0 , 0 , 9 , 0 , 1 , 3}
        };

        if (sudokusolver(sudoku, 0, 0)) {
            System.out.println("solution exists");
            printsudoku(sudoku);
        } else {
            System.out.println("solution doesn't exist");
        }
    }
}
