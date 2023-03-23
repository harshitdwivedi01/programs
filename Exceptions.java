public class Exceptions {
    public static void main(String[] args) throws ArithmeticException {
        try {
            int m = 10;
            int n = 0;
            int ans = m / n;
            System.out.println(ans);
        } finally {
            System.out.println("Hi");
        }
    }
}