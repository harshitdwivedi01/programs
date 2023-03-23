public class Deloitte02 {
    public static void main(String[] args) {
        String str = "adasaoo";
        boolean flag = false;
        char ch = str.charAt(0);
        for (int i = 0; i < str.length(); i += 2) {
            if (str.charAt(i) == ch)
                flag = true;
            else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
