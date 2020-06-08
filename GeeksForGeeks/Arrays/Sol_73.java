import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    int o=sc.nextInt();
	
	
		 int a[] = new int[m],b[] = new int[n],c[] = new int[o],f=0,j=0;
		   
		 for(j=0;j<m;j++){
		     a[j]=sc.nextInt();
		 }
		 
		 for(j=0;j<n;j++){
		     b[j]=sc.nextInt();
		 }
		 
		 for(j=0;j<o;j++){
		     c[j]=sc.nextInt();
		 }
		 
		 j=0;int l=0,i=0;
		 String res="";
		 
		 while(i<m && j<n && l<o ){
		         if(i<=m-2 && a[i]==a[i+1]) 
                    i++;
                if(j<=n-2 && b[j]==b[j+1])
                     j++;
                if(l<=o-2 && c[l]==c[l+1])
                     l++;
		     if(a[i]==b[j] && b[j]==c[l]){
		       res+=a[i]+ " ";
		       i++;j++;l++;
		     }
		      else if(a[i]<b[j])
		       i++;
		      else if(b[j]<c[l])
		       j++;
		      else
		       l++;
		 }
		 if(res=="")
		 System.out.println(-1);
		 else
		 System.out.println(res);
	  }	 
	}
}