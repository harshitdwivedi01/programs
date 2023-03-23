/**
 * problem1704
 */
public class problem1704 {

    public static void main(String[] args) {
        String str = "textbook";
        int fcount = 0;
        int lcount = 0;
        for (int i = 0; i < str.length() / 2; i++)
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
                fcount++;
        for (int i = str.length() / 2; i < str.length(); i++)
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
                lcount++;
        System.out.println((fcount == lcount));
    }
}