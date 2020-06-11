import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);    
    
		int T=Integer.parseInt(br.readLine());
	
		for(int i=1;i<=T;i++){
		    int n=Integer.parseInt(br.readLine());
		    
		 int arr[] = new int[n],j;
		 
		 String line = br.readLine(); // to read multiple integers line
         String[] strs = line.trim().split("\\s+");
         
		 for(j=0;j<n;j++){
		     arr[j]=Integer.parseInt(strs[j]);
		 }
		   check(arr,n);
		}
	}
	
	public static void check(int a[],int n){
	    int max=a[n-1];
		 String res=""+max;
		 
		 for(int j=n-2;j>=0;j--){
		     if(a[j]>=max){
		         res=a[j]+" "+ res;
		         max=a[j];
		     }
		 }
		 
		 System.out.println(res);
		 
	}
}