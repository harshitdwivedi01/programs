//program of square a number using function

import java.util.*;
class Square{
	public static void main(String[] args) {
		System.out.println("enter the number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.println("square: "+ square(n));

	}

	static int square(int n) {
		return n*n; 
  }
}
