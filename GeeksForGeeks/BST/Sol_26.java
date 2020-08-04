Total number of possible Binary Search Trees with n different keys (countBST(n)) = Catalan number Cn = (2n)! / ((n + 1)! * n!)


Total number of possible Binary Trees with n different keys (countBT(n)) = countBST(n) * n!


tech does vide- https://www.youtube.com/watch?v=OIc0mHgHUww


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc =  new Scanner(System.in);
	 int T=sc.nextInt();
	 
	 for(int i=0;i<T;i++){
	     int n=sc.nextInt();
	     
	     System.out.println(countBST(n));
	 }
	 }
	 static int countBST( int n) 
        { 
            // find nth catalan number 
            int count = catalan(n); 
            return count; 
        } 
    static int catalan( int n) 
    { 
          
        // Calculate value of 2nCn 
        int c = binomialCoeff(2 * n, n); 
      
        // return 2nCn/(n+1) 
        return c / (n + 1); 
    }  
    
    static int binomialCoeff(int n, 
                         int k) 
    { 
        int res = 1; 
      
        // Since C(n, k) = C(n, n-k) 
        if (k > n - k) 
            k = n - k; 
      
        // Calculate value of  
        // [n*(n-1)*---*(n-k+1)] /  
        // [k*(k-1)*---*1] 
        for (int i = 0; i < k; ++i) 
        { 
            res *= (n - i); 
            res /= (i + 1); 
        } 
      
        return res; 
    } 
}