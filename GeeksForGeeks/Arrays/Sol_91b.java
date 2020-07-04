import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
		
		for(int m=1;m<=T;m++){
		    int n=sc.nextInt();
	        int sum=sc.nextInt();
	        
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		 }
		 
		 int l=0,r=0,max=0,f=0,curs=0;
		 HashMap<Integer,Integer> hm= new HashMap<>();

         for (int i = 0; i < n; i++) {
		     curs+=a[i];
		     if(curs==sum){
		         max=i+1;
		         //break;
		     }
		     
		    if(hm.containsKey(curs-sum)){
		       // s = hm.get(curs - sum) + 1; 
                //e = i; 
                 max=Math.max(max,(i-hm.get(curs-sum)));
                //break; 
		     }
		    if(!hm.containsKey(curs))
		     hm.put(curs,i);
		     //l++;
		   }

		 //if(f==0)
		 //System.out.println(-1);
		 System.out.println(max);
	  } 
	}
}