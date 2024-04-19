package BackTracking;

public class GridWays {

    //  i and j denote the current row and column of the grid 
    // initially it is 0 , 0 denoting the source grid 
    // destination grid is (n-1 , m-1)
    public static int printGridWays(int i, int j, int gridrows, int gridcols) {
        // base case 
        // if the current row and col reached the target grid then target reached so only 1 move to itself 
        if(i == gridrows-1 && j == gridcols -1 )
            return 1;
        // when current row or current col moves out of the grid while moving down or right just return 0 as no valid moves 
        else if(i == gridrows || j == gridcols)
            return 0; 


        // recursion = work to be done 
        // right approach ways 
        int ways1 = printGridWays(i, j + 1, gridrows, gridcols);
        // down approach ways 
        int ways2 = printGridWays(i + 1, j, gridrows, gridcols);

        return ways1 + ways2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(printGridWays(0, 0, n, m));
    }
    
    //  Time complexity 

    /*
    
    -Each Cell we have two choices :
        1) Either move right
        2) Move down 
    
    -So for n X m grid we will have (n+m) cells 
    -each cell will have 2 choices either right or down 
    -So total moves /choices  = 2^(n+m) 
    -time complexity = O(2^(n+m))
    
     */

}
