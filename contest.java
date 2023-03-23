public class contest {
    public static void main(String[] args) {
        String a = "10";
        String b = "12";
        int n = Integer.parseInt(a);
        int m = Integer.parseInt(b);
        int count = 0;
        for (int i = n; i <= m; i++) {
            count += fun(i);
        }
        System.out.println(count);
    }

    static int fun(int n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        int xoor = 0;
        while (n != 0) {
            int rem = n % 10;
            xoor = xoor ^ rem;
            max = Math.max(max, rem);
            min = Math.min(min, rem);
            n /= 10;
        }
        sum = (max + min) / 2;
        if (xoor > sum)
            return 1;
        else
            return 0;
    }
}
