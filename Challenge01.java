import java.util.Stack;

public class Challenge01 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 5, 4, 6, 8 };
        int[] res = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            res[i] = max;
        }
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
    }

}
