public class Deloitte04 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int count = 0;
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (hasPowerOf2(arr[i])) {
                count++;
                sum += arr[i];
            }
        }
        System.out.println(count + " " + sum);
    }

    public static boolean hasPowerOf2(int n) {
        long val = 0;
        for (int i = 0; i <= n / 2; i++) {
            val = (long) Math.pow(2, i);
            if (val == n)
                return true;
            else if (val > n) {
                break;
            }
        }
        return false;
    }
}
