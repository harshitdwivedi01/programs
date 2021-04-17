/**  STRINGS PROBLEM
Input Format

You are given two strings,  and , separated by a new line. Each string will consist of lower case Latin characters ('a'-'z').

Output Format

In the first line print two space-separated integers, representing the length of  and  respectively.
In the second line print the string produced by concatenating  and  ().
In the third line print two strings separated by a space,  and .  and  are the same as  and , respectively, except that their first characters are swapped.

Sample Input

abcd
ef
Sample Output

4 2
abcdef
ebcd af

**/

import java.util.*;
class ArrayL{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = sc.next();
		int count=0;
		int count1=0;
		for(int i=0;i<s.length();i++){
			count++;
		}
		System.out.print(count + " ");

		for(int i=0;i<s1.length(); i++){
			count1++;
		}
		System.out.println(count1);
		System.out.println(s.concat(s1));
		s = s.replace('a','e');
		s1 = s1.replace('e', 'a');
		System.out.print(s + " ");
		System.out.print(s1);
	}
}
