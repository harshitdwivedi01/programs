import java.util.*;
public class Challenge58 {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        String[] s = str.split(" ");
        Stack<String> st = new Stack<>();
        for(int i=0;i<s.length;i++)
        if(s[i]!=" ")
        st.push(s[i]);
        System.out.print(st.peek().length());
    }
}
