
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		int j;
		
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    
		 long a[] = new long[n];
		 Map<Long,Long> m= new HashMap<Long,Long>();
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextLong();
		     if(m.containsKey(a[j]))
		        m.put(a[j], m.get(a[j]) + 1);
		    else
		        m.put(a[j],1L);
		 }
		 
		 for(j=0;j<n;j++){
		    if(m.get(a[j])==1){
		        System.out.println(a[j]);
		        break;
		    }
		 }    
    } 
	}
}