import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int x=1;x<=T;x++){
		    int n=sc.nextInt();
	        int sum=sc.nextInt();
	        
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 }
		 int f=0;
		 Arrays.sort(a);
		 
		 for (int i = 0; i < n- 2; i++) { 

           int l = i + 1; 
           int r = n - 1; 
            while (l < r) { 
                if (a[i] + a[l] + a[r] == sum) { 
                    f=1;break;
                } 
                else if (a[i] + a[l] + a[r] < sum) 
                    l++; 
  
                else 
                    r--; 
            } 
        } 
        System.out.println(f);
		}
	 }
}