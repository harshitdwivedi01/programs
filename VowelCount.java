/* Return the number (count) of vowels in the given string.

** We will consider a, e, i, o, u as vowels for this Kata (but not y).

***The input string will only consist of lower case letters and/or spaces.
*****/


public class Vowels {

  public static int getCount(String s) {
    int vowelsCount = 0;
    for(int i = 0; i< s.length(); i++){
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
				vowelsCount++;
			}
		}
    return vowelsCount;
  }

}
