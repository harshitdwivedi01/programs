import java.util.*;

public class IBM01 {
    public static void main(String[] args) {
        int[] nums = new int[] { 550, 67, 45, 820, 717, 3, 90, 636 };
        int k = 2;
        List<Integer> ds = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            isThree(nums[i], ds);
            Collections.sort(ds);
        }
        if (k < ds.size())
            System.out.println(ds.get(k - 1));
    }

    public static void isThree(int n, List<Integer> ds) {
        int count = 0;
        int temp = n;
        while (n != 0) {
            int rem = n % 10;
            count++;
            n /= 10;
        }
        if (count == 3)
            ds.add(temp);
    }
}
