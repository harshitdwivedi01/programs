import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 } };
        int[][] res = merge(intervals);
        for (int i = 0; i < res.length; i++) {
        for (int j = 0; j < res[0].length; j++)
        System.out.print(res[i][j] + " ");
        }
        System.out.println();
        // int start = intervals[0][1];
        // System.out.print(start);
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int first[] : intervals) {
            if (first[0] <= end)
                end = Math.max(end, first[1]);
            else {
                list.add(new int[] { start, end });
                start = first[0];
                end = first[1];
            }
        }
        list.add(new int[] { start, end });
        return list.toArray(new int[0][]);
    }
}
