import java.util.*;

public class Deloitte05 {
    public static void main(String[] args) {
        String s = "call taxi";
        Set<Character> se = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (!se.contains(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
            se.add(s.charAt(i));
        }
        System.out.println(sb);
    }
}
