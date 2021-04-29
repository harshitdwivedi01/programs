/**Input format:
First input line will contain a single Integer N
Second line will consist of N space separated integers

Output format:
Print the required maximum difference.

Constraints:
1<=N<=10^5
1<=Ai<=10^5

Time limit:
1.0 sec

Example:
Input
7
2 3 10 6 4 8 1

Output
8
**/

import java.util.*;
class MaxDifference{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dif=0;
		int[] a = new int[n];
		int[] diff = new int[n-1];
 		for (int i=0;i<n;i++) {
			a[i] =sc.nextInt();
		}
		for(int i=0;i<n;i++){
			dif = a[i]-a[i+1];
			diff[i] =dif;
			if(diff[i]>diff[i+1])
			System.out.println(diff[i]);
		}
	}
}
