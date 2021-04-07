//CODEWARS              highAndLow("1 2 3 4 5")  // return "5 1"
//In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.import java.util.Scanner;


class HighLow{
	public static void main(String[] args){
		System.out.println("number of elements stored in array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p,temp;
		int[] a = new int[n];
		System.out.println("numbers are: ");
		for(int i = 0; i<n; i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
			p=i;
			for (int j=i+1;j<n;j++) {
				if(a[p]>a[j]){
					p=j;
				}
				
			}if(p!=i){
				temp=a[i];
				a[i] = a[p];
				a[p] = temp;
			}
		}
		
			System.out.println(a[n-1]+"  "+ a[0]);
	}
}
