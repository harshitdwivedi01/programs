public class Deloitte03 {
    public static void main(String[] args) {
        // int n = 10;
        String[] str = new String[] { "2", "1", "4", "3", "6", "5", "8", "7", "9", "0" };
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i += 2) {
            sb.append(str[i]);
        }
        for (int i = 1; i < str.length; i += 2) {
            sb.append(str[i]);
        }
        System.out.println(sb);
    }
}
