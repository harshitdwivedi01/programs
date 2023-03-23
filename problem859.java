/**
 * problem859
 */
public class problem859 {
    public static void main(String[] args) {
        String s = "ab";
        String goal = "ba";
        char ch[] = swap(s, 0, 1);
        String str = String.valueOf(ch);
        System.out.println(str.equals(goal));

    }

    public static char[] swap(String s, int i, int j) {
        char[] ch = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
}