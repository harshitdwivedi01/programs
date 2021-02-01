import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		System.out.println("enter the first number: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		System.out.println("enter the second number: ");
		int n2 = sc.nextInt();
		System.out.println("Enter the operator code: ");
		int option= sc.nextInt();
		double result;
		switch(option){
			case 1 : 
			result = n1 + n2;
			break;
			case 2 : 
			result = n1-n2;
			break;
			case 3 : 
			result = n1*n2;
			break;
			case 4 :
			result = n1/n2;
			break;
			default:
			System.out.println("Error");
			return;

		}
		System.out.println("result: " + result);
	}
}
