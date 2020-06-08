import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		   
		    int n=sc.nextInt();
		   
		 char a[] = new char[n],b[] = new char[n],f=0,j=0;
		 TreeSet<Character> hs = new TreeSet<>();
		 TreeSet<Character> hs1 = new TreeSet<>();
		 
		 for(j=0;j<n;j++){
		     String s=sc.next();
		     a[j]=s.charAt(0);
		     hs.add(a[j]);
		 }
		 
		 for(j=0;j<n;j++){
		     String s1=sc.next();
		     b[j]=s1.charAt(0);
		     hs1.add(a[j]);
		 }
		 
		 //Arrays.sort(b);
		 
		 for(j=0;j<n;j++){
		     if(hs.contains(b[j]))
		       b[j]=a[j];
		 }
		  Iterator<Character> itr=hs.iterator(); 
		  
          while(itr.hasNext()){  
           System.out.print(itr.next()+" ");  
          }
         
		  System.out.println();
		  
		  Iterator<Character> itr1=hs1.iterator(); 
		  
          while(itr1.hasNext()){  
           System.out.print(itr1.next()+" ");  
          }
         
		  System.out.println();
		 
		}
	}
}







------------------------------------------------------------------------------------------------------


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		   
		    int n=sc.nextInt();
		   
		 char a[] = new char[n],b[] = new char[n],f=0,j=0;
		 HashSet<Character> hs = new HashSet<>();
		 
		 for(j=0;j<n;j++){
		     String s=sc.next();
		     a[j]=s.charAt(0);
		     hs.add(a[j]);
		 }
		 
		 for(j=0;j<n;j++){
		     String s1=sc.next();
		     b[j]=s1.charAt(0);
		    
		 }
		 
		 Arrays.sort(b);
		 
		 for(j=0;j<n;j++){
		     if(hs.contains(b[j]))
		       a[j]=b[j];
		 }
		 
		 for(j=0;j<n;j++){
		     System.out.print(a[j]+ " ");
		 }
		  System.out.println();
		  
		 for(j=0;j<n;j++){
		     System.out.print(b[j]+" ");
		 }
		 
		 System.out.println();
		}
	}
}