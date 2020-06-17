import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int m=1;m<=T;m++){
		    int n=sc.nextInt();
	       
	        
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 } 
		 
		int k=sc.nextInt();
	    
	    int i;
	    String res1="";
	     Queue<Integer> al = new LinkedList<>();  
	    
	    for( i=0;i<k;i++){
	        if(a[i]<0)
	           al.add(i);
	    }
	 
	       
	    for( i=k;i<n;i++){
	       if(!al.isEmpty())
	         res1+=a[al.peek()]+" ";

	       else
	          res1+="0" +" ";
	          
	       while(!al.isEmpty() && al.peek()<i-k+1)
	          al.remove();
	          
	       if(a[i]<0)
	        al.add(i);
	    }
	    
	    if(al.isEmpty())
	      System.out.println(res1+0);
	    else 
	      System.out.println(res1+a[al.peek()]);
	      
	}
	}	
}