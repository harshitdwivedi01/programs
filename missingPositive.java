import java.util.HashSet;

public class missingPositive {
    public static void main(String[] args) {
        int[] arr = { 0, -9, 2, 3, -4, 5 };
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                set.add(arr[i]);
            max = Math.max(max, arr[i]);
        }
        for (int i = 1; i <= max + 1; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}