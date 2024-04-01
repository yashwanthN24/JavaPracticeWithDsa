package Recursion;

public class TilingProblem {
    public static int TilinngProb(int n) {
        // Floor is 2 * n 

        // Tile size is 2 * 1 

        // base case : if n == 0 that is floor is a 2 * 0 so its  a line then no tiles can be added (no tiles is also 1 way )
        // if n == 1 then floor size = 2*1 then it exactly matches tile size  so only 1 way to fill/tail the floor
        if (n == 0 || n == 1) {
            return 1;
        }

        // small work that is to be done is making a choice (whether horizontal tile or vertical tile)
        // vertical tile - we assume we already place 1 vertical tile so for 2 * n-1 floor we call f(n-1)
        // if f(n) dentoes  ways to tile or fil floor of 2 * n , then f(n-1 ) is ways to tile 2 * (n-1) floor 

        // call the inner function that recursion does that is calling f(n-1 ) for vertical tail 
        int fnm1 = TilinngProb(n - 1);

        //horizontal tile - we assume we already place two horizontal tiles now to fill remaining 2 * (n-2 ) floor we call f(n-2)
        // for horizontal we need to horizontal tile and remaining 2 * n-2 has to be tiled so we call 
        int fnm2 = TilinngProb(n - 2);

        //  total ways is considering both horizontal and vertical tiles to cover 2 * n floor 
        // now we consider horizontal tile ways or vertical ways ( a combination ) by adding their horizontal and vertical ways 
        int totways = fnm1 + fnm2;
        return totways;

    }

    public static void main(String[] args) {
        System.out.println(TilinngProb(2));
        //  so we are asking for tiling a floor or size 2 * n (i.e n = 3 ) so 2 * 3  
    }
}
