/** 
INPUT: 5HELLO
OUTPUT: TRUE5

INPUT : 7THANKS
OUTPUT: False6

**/

import java.util.*;
class Digital{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String s1 = sc.next();
		int n = s1.length();
		char ch = s1.charAt(0);
		char ch1 = (char)(n-1 + '0');
    
		if(ch==ch1)
			System.out.println("True"+ch1);
		else
			System.out.println("False"+ch1);
		}
}
