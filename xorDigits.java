public class xorDigits {
    public static void main(String[] args) {
        int n = 12;
        int xor = 0;
        while (n != 0) {
            int rem = n % 10;
            xor = xor ^ rem;
            n /= 10;
        }
        System.out.println(xor);
    }
}