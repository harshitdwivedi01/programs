import java.util.*;

public class Deloitte06 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 12, 23, 34, 45, 56, 67, 78, 89 };
        int[] arr2 = new int[] { 23, 11, 45, 56, 99, 78 };
        Set<Integer> se = new TreeSet<>();
        for (int i = 0; i < arr1.length; i++)
            se.add(arr1[i]);
        List<Integer> ds = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if (se.contains(arr2[i]))
                ds.add(arr2[i]);
        }

        for (int i = 0; i < ds.size(); i++)
            System.out.print(ds.get(i) + " ");
    }
}
