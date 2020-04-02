/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    
		 int a[] = new int[n];
		 
		 for(int j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 
		    int start = 0, end = n - 1;
            while (start < end) {
                if (a[start] == 0) {
                start++;
                continue;
                }
                if (a[end] == 1) {
                end--;
                continue;
                }
                
                a[start++] = 0;
                a[end--] = 1;
            }    
            for(int j=0;j<n;j++)
            System.out.print(a[j]+ " ");
            
             System.out.println();
	}
}
}