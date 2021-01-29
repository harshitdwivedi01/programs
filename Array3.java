/* program to read five numbers,find their sum and 
* print the number 
*/ in reverse order

import java.util.Scanner;
class Array3{
	static void reverse(int[] arr){
		for(int i = arr.length-1;i >= 0; i--){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args){
		System.out.println("Enter the numbers: ");
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[5];
	int result = 0;
	for (int i = 0;i < arr.length;i++) {
        arr[i] = sc.nextInt();
	}
	System.out.println("Elements present in array are: ");
	for (int i = 0;i < arr.length;i++){
		System.out.println(arr[i]);
		result += arr[i];
	}
        System.out.println("result is : " + result);
       System.out.println("\nReveresed Array:");
			reverse(arr);

	}
}
