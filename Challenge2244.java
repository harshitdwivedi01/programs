import java.util.HashMap;
import java.util.*;

public class Challenge2244 {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 2, 3, 3, 2, 4, 4, 4, 4, 4 };
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]));
            else
                map.put(nums[i], 1);
        }
        for (Map.Entry<Integer, Integer> hm : map.entrySet()) {
            if (hm.getValue() == 3) {
                count++;
                hm.setValue(0);
            } else if (hm.getValue() == 2) {
                count++;
                hm.setValue(0);
            } else if (hm.getValue() > 3) {
                int temp = hm.getValue();
                int dif = temp - 3;
                int ans = temp - 2;
                if (dif % 2 == 0 || dif % 3 == 0 || ans % 2 == 0 || ans % 3 == 0) {
                    count++;
                    hm.setValue(dif);
                }
            } else if (hm.getValue() == 1) {
                System.out.println("-1");
                break;
            }
        }
        System.out.println(count);
    }
}
