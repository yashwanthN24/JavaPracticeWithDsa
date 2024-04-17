package BackTracking;

public class NQueensPrint1Solution {
        public static void printBoard(char board[][]) {

            System.out.println("---------- ChessBoard ---------");
    
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        public static boolean nqueens(char board[][], int row) {
            // base case 
            if (row == board.length) {
                return true ;
            }
    
            // recursion or work to be done 
    
            // loop to iterate through column 
            for (int j = 0; j < board.length; j++) {

                // now lets place the queen only if its safe to place at current row and column (j)

                if (issafe(board, row, j)) {

                    // place the queen in each row
                    board[row][j] = 'Q';
                    // recursive function call to place all queen in n different rows
                    if (nqueens(board, row + 1)) {
                        return true;
                    }
                    // now we have to remove the placed queen for the next possible solution 
                    // backtracking step 
                    board[row][j] = 'X';

                }

            }
            
            return false; 
        }
        
        public static boolean issafe(char board[][], int row, int column) {
            // check vertical attack 
            for (int i = row-1; i >= 0; i--) {
                if (board[i][column] == 'Q')
                    return false;
            }
    
            // check left diagnol attack 
            for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; j--, i--) {
                if (board[i][j] == 'Q')
                    return false;
    
            }
    
            // check right diagnol attack 
            for (int i = row - 1, j = column + 1; j < board.length && i>=0; i--, j++) {
                if (board[i][j] == 'Q')
                    return false;
            }
    
            // else no attacks present issafe to place the queen at row and column 
            return true; 
        }
        
    
        public static void main(String[] args) {
            int N = 4;
            
            // creating the chess board 
            char board[][] = new char[N][N]; // N * N chess board 
    
            // initialization of chess board 
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = 'X';
                }
            }
    
            // printBoard(board);
    
            // now we place N queens in each N rows 
            if (nqueens(board, 0)) {
                System.out.println("solution exits :");
                printBoard(board);
            } else {
                System.out.println("Solution doesnt exist");
            }
        }
    }
