Nimport java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int s=0,p=-100,i,j;

        for (i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        for(i=1;i<5;i++)
         {
            for(j=1;j<5;j++){
                s=arr[i][j] +arr[i-1][j] + arr[i-1][j-1] + arr[i-1][j+1] + arr[i+1][j+1]+arr[i+1][j] + arr[i+1][j-1];
            if(s>p){
                p=s;
                s=0;
            }   
           }  
         }
      
        System.out.println(p);
        scanner.close();
    }
}
