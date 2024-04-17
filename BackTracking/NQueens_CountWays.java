package BackTracking;

public class NQueens_CountWays {

    // count variable to track the number of way to solve a NQueens problem for N X N Chessboard 

    static int count = 0; 

    public static void printBoard(char Board[][]) {
        System.out.println("------- ChessBoard ---------");
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void NQueens(char Board[][], int row) {
        // base case 
        if (row == Board.length) {
            count++;
            printBoard(Board);
            return;
        }

        // recursion - work to be done 

        // loop to iterate through the column 

        for (int j = 0; j < Board.length; j++) {
            if (issafe(Board, row, j)) {
            Board[row][j] = 'Q';
            NQueens(Board, row + 1);
            Board[row][j] = 'X';
            }
        }
    }
    
    public static boolean issafe(char board[][], int row, int col) {
        // check vertical attack 
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }


        // check left diagnol attack 
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q')
                return false;
        }

        // check right diagnol attack
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        // else safe to place the queen 
        return true; 
    }
    public static void main(String[] args) {
        int N = 5;
        
        // creation of  N X N chess board
        char board[][] = new char[N][N];

        // intialization of chessboard with 'X' denoted nothing in that position 
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 'X';
            }
        }

        // print chessboard
        // printBoard(board);

        // Now place N queens in N rows 
        NQueens(board, 0);
        System.out.println();
        System.out.println("Total ways to solve n queens is " + count);
        
        System.out.printf("%d ways we can place %d queens in each row in an %d X %d chess board without any attack " , count , N , N , N);

    }
}
