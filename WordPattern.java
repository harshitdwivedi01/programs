import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String s = "How are you";
        String[] str = s.split(" ");
        String p = "abc";
        HashMap<Character,String> hm = new HashMap<>();
        for(int i=0;i<p.length();i++){
            if(!hm.containsKey(p.charAt(i)))
            hm.put(p.charAt(i),str[i]);
            else{
                String temp= hm.get(p.charAt(i));
                boolean flag = match(temp,str[i]);
            }
        }
    }
    public static boolean match(String s, String t){
        if(s.length()!=t.length())
        return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i))
            return false;
        }
        return true;
    }
}
