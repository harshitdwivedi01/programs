import java.util.*;

public class GridGame {
    public static void main(String[] args) {
        int grid[][] = { { 3, 3, 1 }, { 8, 5, 2 } };
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int rows[] : dp)
            Arrays.fill(rows, -1);
        int ans = fun(n - 1, m - 1, grid, dp);
        System.out.println(ans);
    }

    static int fun(int n, int m, int grid[][], int[][] dp) {
        if (n == 0 && m == 0)
            return grid[0][0];
        if (n < 0 || m < 0)
            return 0;
        if (dp[n][m] != -1)
            return dp[n][m];
        int left = grid[n][m] + fun(n, m - 1, grid, dp);
        int up = grid[n][m] + fun(n - 1, m, grid, dp);
        return dp[n][m] = Math.max(left, up);
    }
}
