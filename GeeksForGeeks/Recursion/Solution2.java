import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int rows=0, cols=0;
		for(int i=1;i<=T;i++){
		    rows=sc.nextInt();
		    cols=sc.nextInt();
		System.out.println(numberOfPaths(rows,cols));
		}
	}		
		 static int numberOfPaths(int m, int n) 
         { 
        
        if (m == 1 || n == 1) 
            return 1; 
  
        
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1); 
        
	  }
}
