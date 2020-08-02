


//m1 - using dijikstra algo for each vertex (o(n3))

//m-2 - solved using dp (seen abdul wari) o(n3)
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	   Scanner sc=new Scanner(System.in);
	  
	   int T=sc.nextInt();
	   
	   for(int u=1;u<=T;u++){
	       int V=sc.nextInt();
	
	       int m[][]=new int[V][V],i,j,k, dist[][]=new int[V][V];
	       
	       for (i = 0; i < V; i++) 
            for (j = 0; j < V; j++) 
                m[i][j] = sc.nextInt(); 
           
           for (i = 0; i < V; i++) 
            for (j = 0; j < V; j++) 
                dist[i][j] = m[i][j];     
                
                
             for (k = 0; k < V; k++) 
                { 
                    for (i = 0; i < V; i++) 
                    { 
                        for (j = 0; j < V; j++) 
                           dist[i][j] =Math.min(dist[i][k] + dist[k][j],dist[i][j]); 
                    } 
                } 
            StringBuffer sb=new StringBuffer();
            for (i = 0; i < V; i++) {
            for (j = 0; j < V; j++) {
                if(dist[i][j]<Math.pow(10,7))
                  sb.append(dist[i][j]+" ");   
                else
                  sb.append("INF"+" ");
            }
              sb.append("\n");
           // System.out.println();
            }
            System.out.println(sb.toString().trim());
	   }
	  
	 }
}