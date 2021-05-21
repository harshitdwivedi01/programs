/* Given an array and an integer B, traverse the array (from the beginning) and if the element in array is B, double B 
and continue traversal. Find the value of B after the complete traversal.

Example 1:

Input:
N = 5, B = 2
arr[] = {1 2 3 4 8}
Output: 16
Explanation: B is initially 2. We get 2 at
the 1st index, hence B becomes 4. 
Next, we get B at the 3rd index, hence B 
becomes 8. Next, we get B at 4-th index, 
hence B becomes 16.

Example 2:

Input:
N = 5, B = 3
arr[] = {1 2 3 4 8}
Output: 6
Explanation: B is initially 3. We get 3 at
the 2nd index, hence B becomes 6.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).


Constraints:
1<=N<=50
1<=B<=1000
1<=arr[i]<=1018

*/

import java.util.*;
public class DoublingValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int b = sc.nextInt();
		int p=0;
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			while(b==a[i]) 
				b=2*a[i];
		}
		System.out.println(b);
	}
}
