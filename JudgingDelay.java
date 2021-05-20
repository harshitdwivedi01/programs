/* 
Example Input
1
5
1 3
4 4
4 10
1 11
2 7
Example Output
2
Explanation
Example case 1: The delays of the respective submissions are 2 minutes, 0 minutes, 6 minutes, 10 minutes and 5 minutes. 
Only submissions 3 and 4 are delayed by more than 5 minutes, hence the answer is 2
*/

//Problem Code: JDELAY


package programs;
import java.util.*;
public class JudgingDelay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int count =0;
		int p,q;
		for(int i=1;i<=t;i++) {
			int n = sc.nextInt();
			for(int j=1;j<=n;j++) {
				p=sc.nextInt();
				q=sc.nextInt();
				int r = q-p;
				if(r<5) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
