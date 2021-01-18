import java.util.Scanner;
class Factors{
	public static void main(String[] args){
		System.out.println("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 2; n>1;){
			if(n%i==0){
				System.out.println(i + " ");
				n = n/i;
			}else 
			i++;
		}
	}
}
