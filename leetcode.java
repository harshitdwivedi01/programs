import java.util.*;

public class leetcode {
    public static void main(String[] args) {
        int[][] grid = { { 0, 1, 1 }, { 1, 0, 1 }, { 0, 0, 1 } };
        int n = grid.length;
        int m = grid[0].length;
        int or = 0;
        int oc = 0;
        int count = 0;
        int[][] diff = new int[n][m];
        for (int rval[] : diff)
            Arrays.fill(rval, 0);
        int rows[] = new int[n];
        int oneRows[] = new int[n];
        int oneCols[] = new int[m];
        // count zero in ith row
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0)
                    count++;
            }
            rows[i] = count;
        }
        // count one in ith col
        for (int i = 0; i < n; i++) {
            or = 0;
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1)
                    or++;
            }
            oneRows[i] = or;
        }
        // count zero in ith column
        int cnt = 0;
        int cols[] = new int[m];
        for (int i = 0; i < m; i++) {
            cnt = 0;
            for (int j = 0; j < n; j++) {
                if (grid[j][i] == 0)
                    cnt++;
            }
            cols[i] = cnt;
        }
        // count one in ith column
        for (int i = 0; i < m; i++) {
            oc = 0;
            for (int j = 0; j < n; j++) {
                if (grid[j][i] == 1)
                    oc++;
            }
            oneCols[i] = oc;
        }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // diff[i][j] = (oneRows[i] + oneCols[j]) - (rows[i] + cols[j]);
        // }
        // }
        for (int i = 0; i < oneRows.length; i++)
            System.out.print(oneRows[i] + " ");
    }
}