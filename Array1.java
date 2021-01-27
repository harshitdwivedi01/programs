import java.util.Scanner;
class Array1{
	public static void main(String[] args){
		System.out.println("Enter the value: ");
		int result = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
			System.out.print("\n at "+ i + " index: " + arr[i]);
			System.out.print("\n ");
			result += arr[i];
		}
		System.out.println("\n result: "+ result);
	}
}