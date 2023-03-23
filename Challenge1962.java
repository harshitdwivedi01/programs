import java.util.*;

public class Challenge1962 {
    public static void main(String[] args) {
        int[] piles = new int[] { 5,4,9 };
        int k = 2;
        int n = piles.length; int sum=0;
        Arrays.sort(piles);
        while(k!=0){
            Arrays.sort(piles);
            for(int i=n-1;i>=n/2;i--){
                int temp = (int)Math.floor(piles[i]/2);
                piles[i]-=temp;
                k--;
                if(k==0) break;
            }
        }
        for(int i=0;i<piles.length;i++){
            sum+=piles[i];
        }
        System.out.println(sum);
    }
}