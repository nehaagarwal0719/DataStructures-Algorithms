import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
		int T=sc.nextInt();
	
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
	     	StringBuffer res=new StringBuffer();
		 int a[] = new int[n],j;
		 
		 for(j=0;j<n;j++){
		     a[j]=sc.nextInt();
		     a[j]=a[j]-1;
		 } 
		 
		 for(j=0;j<n;j++){
		     a[a[j]%n] = a[a[j]%n] + n;
		 }
		 
		 for(j=0;j<n;j++){
		     res.append(a[j]/n+" ");
		 }
		 System.out.println(res);
		} 
	}
}

//better sol
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n = sc.nextInt();
		    int[] freq = new int[n];
		    for(int i = 0; i <n;i++){
		        freq[sc.nextInt()-1]++;
		    }
		    StringBuilder sb = new StringBuilder();
		    for(int i =0; i < n; i++){
		        sb.append(freq[i]).append(" ");
		    }
		    System.out.println(sb);
		    t--;
		}
	}
}