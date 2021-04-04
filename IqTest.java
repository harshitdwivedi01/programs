/* Bob is preparing to pass IQ test. The most frequent task in this test is to find out which one of the given numbers differs from the others. 
*Bob observed that one number usually differs from the others in evenness. 
*Help Bob — to check his answers, he needs a program that among the given numbers finds one that is different in evenness, and return a position of this number.
***! Keep in mind that your task is to help Bob solve a real IQ test, which means indexes of the elements start from 1 (not 0).....
*/

import java.util.Scanner;
class IqTest{
	public static void main(String[] args) {
		System.out.println("enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,f=0,g=0;
		int[] arr = new int[n];

		for (i=0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();}

        for(i=0;i<n;i++)
        {
        	if(arr[i]%2==0)
        		f++;
        	else
        		g++;
        }
        if(f>g)
        {
        	for(i=0;i<n;i++)
        		if(arr[i] % 2!=0)
        			System.out.println(arr[i]);
        }
        else if(g>f)
        {
        	for(i=0;i<n;i++)
        		if(arr[i] % 2==0)
        			System.out.println(arr[i]);
        }
		}
 }
