import java.util.HashSet;

public class Deloitte01 {
    public static void main(String[] args) {
        String str = "abc65d19hy09";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
            sb.append(i);
        }
        System.out.println(sb);
    }
}
