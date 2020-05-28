import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		int j;
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    
		 int arr[] = new int[n];
		 
		 for(j=0;j<n;j++){
		     arr[j]=sc.nextInt();
		 }
		 
		 int min = -1,flag=0; 

        HashSet<Integer> set = new HashSet<>(); 
  
        for (j=n-1; j>=0; j--) 
        { 
            // If element is already in hash set, update min 
            if (set.contains(arr[j])) {
                min = j; 
                flag=1;
            }
  
            else   // Else add element to hash set 
                set.add(arr[j]); 
        } 
  
        // Print the result 
        if (flag== 0) 
          System.out.println(min); 
        else
          System.out.println(min+1);
		 
    } 
	}
}