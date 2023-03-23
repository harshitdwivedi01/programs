import java.util.Scanner;

public class ExceptionThrows {
    public static void main(String[] args) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b == 0)
            throw new ArithmeticException();
        int res = a / b;
        System.out.println(res);
        sc.close();

    }
}

/**
 * ArithmeticException
 */
class ArithmeticException extends Exception {
    @Override
    public String toString() {
        return "B cant be zero";
    }

    @Override
    public String getMessage() {
        return "B cannot be zero";
    }

}
