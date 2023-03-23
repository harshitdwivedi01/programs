import java.util.*;

public class program {
    public static void main(String[] args) {
        List<List<String>> grid = new ArrayList<>();
        grid.get(0).set(0, "E");
        grid.get(0).set(1, "1");
        grid.get(0).set(2, "2");
        grid.get(1).set(0, "2");
        grid.get(1).set(1, "X");
        grid.get(1).set(2, "2");
        grid.get(2).set(0, "1");
        grid.get(2).set(1, "2");
        grid.get(2).set(2, "S");

        int n = grid.size();
        int m = grid.get(0).size();
        int[][] dp = new int[n+1][m+1];
        for (int[] rows : dp)
            Arrays.fill(rows, -1);
        int ans = fun(n, m, grid, dp);
        System.out.println(ans);

    }

    public static int fun(int i, int j, List<List<String>> grid, int[][] dp) {
        if (i < 0 || j < 0 || grid.get(i).get(j) == "X")
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (grid.get(i).get(j) == "E")
            return dp[i][j];
        int up = Integer.parseInt(grid.get(i).get(j)) + fun(i - 1, j, grid, dp);
        int left = Integer.parseInt(grid.get(i).get(j)) + fun(i, j - 1, grid, dp);
        int leftUp = Integer.parseInt(grid.get(i).get(j)) + fun(i - 1, j - 1, grid, dp);
        return dp[i][j] = Math.max(up, Math.max(left, leftUp));
    }
}