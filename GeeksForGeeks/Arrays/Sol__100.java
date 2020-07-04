import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	   Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	        
	        
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 }
		 stockBuySell(a,n);
		}
	 }
	 
	 public static void stockBuySell(int[] price, int n) {
        StringBuilder res=new StringBuilder();
        int cur=0,f=0;
        for(int i=0;i<n-1;i++){
            if( price[i]<price[i+1] && f==0){
             cur=price[i];
              res.append("("+ i + " ");
              f=1;
            } 
            else if(price[i]>price[i+1] && f==1){
                res.append(i+")"+ " ");
                f=0;
            }
              
        }
        
        if(price[n-1]>cur && f==1)
          res.append(n-1+")"+ " ");
          if(res.length()!=0)
            System.out.println(res);
          else
           System.out.println("No Profit");
        
    }
}