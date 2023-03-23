import java.util.ArrayList;

public class Subarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int count = 0;
        ArrayList<Integer> ds = new ArrayList<>();
        printSubArrays(arr, 0, 0, ds);
        for (int i = 0; i < ds.size(); i++)
            if (ds.get(i) % 2 != 0)
                count++;
        System.out.println(count);
    }

    static void printSubArrays(int[] arr, int start, int end, ArrayList<Integer> ds) {
        int sum = 0;
        // Stop if we have reached the end of the array
        if (end == arr.length)
            return;
        // Increment the end point and start from 0
        else if (start > end)
            printSubArrays(arr, 0, end + 1, ds);
        // Print the subarray and increment the starting
        // point
        else {
            System.out.print("[");
            for (int i = start; i < end; i++) {
                sum += arr[i];
                System.out.print(arr[i] + ", ");
            }
            ds.add(sum + arr[end]);
            System.out.println(arr[end] + "]");

            printSubArrays(arr, start + 1, end, ds);
        }
        return;
    }
}
