package BackTracking;

public class GridWaysOptimized {

    public static int fact(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        // 3 X 3 grid 

        // in any grid m X n we will have n-1 Down moves in each way/path 
        // and m-1 Right moves in each way/path 

        // so we will have total characters as n-1 + m-1 
        // if we find out the permutations of these n-1 + m-1 character 
        // each permutation represents one way 

        // and in way we will have n-1 repeated D character 
        // and m-1 repeated R character 

        // so total way = (n-1 + m-1 )!/ (n-1)!*(m-1)!

        // we divide by n-1 and m-1 factorial to avoid the duplication of the permutations and to get distinct permutations 

        int totalways = fact(n - 1 + m - 1) / (fact(n - 1) * fact(m - 1));
        System.out.println(totalways);
    }
}
