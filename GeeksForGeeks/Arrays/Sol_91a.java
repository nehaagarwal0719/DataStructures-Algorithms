import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
	         
	    InputStreamReader r1=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r1);    
    
		int T=Integer.parseInt(br.readLine());
		
		int j;
	
         
		for(int i=1;i<=T;i++){
		  
		     int n=Integer.parseInt(br.readLine());
		     
		    
		    
		 int a[] = new int[n];
		 
		 String line = br.readLine(); // to read multiple integers line
         String[] strs = line.trim().split("\\s+");
         
		 for(j=0;j<n;j++){
		     a[j]=Integer.parseInt(strs[j]);
		    
		 }
		 
		 int sum=Integer.parseInt(br.readLine());
		 
		 HashMap<Integer,Integer> hm= new HashMap<>();
		 
		 int l=0,curs=0,f=0,c=0,s=-1,e=-1;
		 
		 while(l<n){
		     curs+=a[l];
		     if(curs==sum){
		         s=0;
		         e=l;
		         break;
		     }
		     
		    else  if(hm.containsKey(curs-sum)){
		        s = hm.get(curs - sum) + 1; 
                e = l; 
                break; 
		     }
		     
		     hm.put(curs,l);
		     l++;
		     }

		 if(e==-1)
		  System.out.println(-1);
		 else
		  System.out.println(s+" "+e);
	  } 
	}
}