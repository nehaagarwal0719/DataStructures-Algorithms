import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception
	 {
	     
	    InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);    
    
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
		 
		 
		 HashMap<Integer, Pair> hm= new HashMap<>();
		 int f=0,sum=0;
		 
		 for(j=0;j<n;j++){
		     for(int k=j+1;k<n;k++){
		        sum=a[j]+a[k];
		        if(!hm.containsKey(sum))
		          hm.put(sum, new Pair(i,j));
		        else{
		           f=1;break;
		        } 
	    	 } 
		 } 
		 System.out.println(f);
		}
	 }
}

class Pair{
    int a , b;
    Pair(int x, int y){
        a=x;b=y;
    }
}