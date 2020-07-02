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
		    int key=sc.nextInt();
		    
		 int a[] = new int[n];
		 int j,c=0;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		  } 
		  int f=0,l=0,r=n-1,max=-1,mid=0;
		  
		  
		  while(l<=r){
		      mid=l+(r-l)/2;
		      //if(a[mid]<key)
		        //max=Math.max(max,mid);
		      if(a[mid]==key){
		          f=1;
		          break;
		      }
		      else if(a[mid]<key){
		       max=mid;
		       l=mid+1;
		      }
		      else
		       r=mid-1;
		       
		  }
		  if(f==1)
		   System.out.println(mid);
		  else
		   System.out.println(max);
		} 
	 }
}