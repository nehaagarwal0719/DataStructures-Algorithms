
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    
		    int a[] = new int[n];
		    int maxsum=0,j;
		 
		    for(j=0;j<n;j++){
		         a[j]=sc.nextInt();
		    } 
		    
		int maxSum[] = new int [n]; 
        maxSum[0] = a[0]; 
        int curr_max = a[0]; 
        for (j = 1; j < n; j++) 
        { 
            curr_max = Math.max(a[j], curr_max+a[j]); 
            maxSum[j] = curr_max; 
        }    
	
		 
		 
		 int k=sc.nextInt();
	
	    int sum=0;
	    for(j=0;j<k;j++)
	       sum+=a[j];
	      
	   maxsum=sum;
	    //System.out.println(maxsum);
	    for(j=k;j<n;j++){
	       sum+=a[j]-a[j-k];     
	       maxsum = Math.max(maxsum, sum); //System.out.println(maxsum);
	       maxsum=Math.max(maxsum,sum+maxSum[j-k]);
	    } 
	    
	    System.out.println(maxsum);
		}
	}
}
	
	