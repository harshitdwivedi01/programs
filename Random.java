/* Given an array of size n which contains n space seperated inetgers of any digits.
INPUT
2
234
879

OUTPUT
9
24

*/

import java.util.*;
public class random {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		//int[] sum1 = new int[n];
		int[] a = new int[n];
		for(int i =0; i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=0;
				while(a[i]!=0) {
					int r = a[i]%10;
					a[i] = a[i]/10;
					sum = sum + r;
				}
         System.out.println(sum);
		}
	}
}
