import java.util.Scanner;
class SumUntilZero{
	public static void main(String[] args){
	int n,sum = 0;
	System.out.println("Enter the numbers: ");
	do{
	Scanner in= new Scanner(System.in);
	n= in.nextInt();
    sum += n;
    
	}while(n!=0);
	System.out.println(sum);
	}
}
