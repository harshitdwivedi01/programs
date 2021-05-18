/*INPUT
87
1353

REVERSE THE INPUT NUMBER and find the resulted sum is palindrome oe not.

 87 +   78 =  165   not a palindrome
 1353 + 3531 = 4884 palindrome!
*/

package programs;
import java.util.*;
public class PalindromeChainLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		int q = n; 
		if(n>10) {
			while(n!=0) {
				int r = n%10;
				sum = (sum*10)+r;
				n=n/10;
			}
			System.out.println(sum);
			int sum1 = q+sum;
			int temp = sum1;
			System.out.println(sum1);
			while(sum1!=0) {
				int r = sum1%10;
				sum2 = (sum2*10)+r;
				sum1=sum1/10;
			}
			if(sum2==temp) {
				System.out.println("palindrome");
			}else
				System.out.println("Not a palindrome");
		}
		else
			System.out.println("please enter a valid number.");
	}	
}
