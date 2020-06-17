import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    
	 Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		    
		 }   
    	 Arrays.sort(a); 
            
         int num1 = 0; 
         int num2 = 0; 
         for(j = 0;j<n;j++){ 
             if(j%2==0) 
                 num1 = num1*10+a[j]; 
             else num2 = num2*10+a[j];
         }
         System.out.println(num1+num2);
        }     
	}
}