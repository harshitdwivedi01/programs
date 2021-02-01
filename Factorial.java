import java.util.Scanner;
class Factorial{
	static void fact(int num){
	int fact = 1;
	for(int i = 2;i<=num;i++)
	fact = fact*i;
	System.out.println("factorial of "+ num + " is "+ fact);
	}
	public static void main(String[] args){
		System.out.println("enter the number : ");
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		fact(n);
	}
}
