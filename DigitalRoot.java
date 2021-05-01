/** Digital root is the recursive sum of all the digits in a number.Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in 
this way until a single-digit number is produced. The input will be a non-negative integer.

Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11

**/

import java.util.*;
public class DRoot {
  public static int digital_root(int n) {
    int sum = 0; 
        int x=0;
          
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
      if(sum<10)
    return sum;
      else{
      	 while (sum != 0)
        {
            x = x + sum % 10;
            sum = sum/10;
        }
        return x;
  }
}
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
  
       System.out.println(digital_root(n));
   }
}
