/**
 * Write a test program that prompts the user 
 * to enter ten numbers, invoke a method 
 * to reverse the numbers, and display the numbers.
 * 
 */
 
 
 import java.util.Scanner;
class Array2{
	static void reverse(int[] arr){
		  for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        } 
	}
	public static void main(String[] args){
		System.out.println("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
			
		} 
		for (int i= 0;i< arr.length;i++ ) {
			System.out.println("original array: "+ arr[i]);
		}
		System.out.println("\nReveresed Array:");
			reverse(arr);
		
	}
}

