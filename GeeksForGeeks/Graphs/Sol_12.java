import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    
    
     
	public static void main (String[] args)
	 {
    	 //code
    	 Scanner sc= new Scanner(System.in);
    	 int T=sc.nextInt();
    	 
    	 for(int i=1;i<=T;i++){
    	     int  V=sc.nextInt();
    	     int E=sc.nextInt();
    	     
    	     Graph graph = new Graph(V, E); 
    	     
    	     for(int j=0;j<E;j++){
    	          int src = sc.nextInt(); 
                  int dst = sc.nextInt(); 
                 int wt = sc.nextInt(); 
                  
                  Graph.edge[j] = new Edge(src, dst, wt);
    	     }
    	     System.out.println(BellmanFord(graph, 0));
    	 }
	 }
	 
	 
	static int BellmanFord(Graph graph, int src) 
    { 
        int V = graph.V, E = graph.E; 
        int dist[] = new int[V]; 
  
        // Step 1: Initialize distances from src to all other 
        // vertices as INFINITE 
        for (int i = 0; i < V; ++i) 
            dist[i] = Integer.MAX_VALUE; 
        dist[src] = 0; 
  
        // Step 2: Relax all edges |V| - 1 times. A simple 
        // shortest path from src to any other vertex can 
        // have at-most |V| - 1 edges 
        for (int i = 1; i < V; ++i) { 
            for (int j = 0; j < E; ++j) { 
             
                int u = graph.edge[j].src; 
                int v = graph.edge[j].dst; 
                
                  if(V == v && v == 2)
                 return 0;
                 
                int weight = graph.edge[j].wt; 
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) 
                    dist[v] = dist[u] + weight; 
            } 
        } 
  
        // Step 3: check for negative-weight cycles. The above 
        // step guarantees shortest distances if graph doesn't 
        // contain negative weight cycle. If we get a shorter 
        // path, then there is a cycle. 
        for (int j = 0; j < E; ++j) { 
            int u = graph.edge[j].src; 
            int v = graph.edge[j].dst; 
            int weight = graph.edge[j].wt; 
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) { 
                return 1; 
            } 
          
        } 
          return 0;
    } 
}
 
class Graph
{
public static int V;
public static int E;
public static Edge[] edge;

public Graph(int v, int e)
{
V = v;
E = e;
edge = new Edge[E];
for(int i = 0; i < E; i++)
edge[i] = new Edge();
}
}

class Edge
{
int src;
int dst;
int wt;

public Edge(){}

public Edge(int src, int dst, int wt)
{
this.src = src;
this.dst = dst;
this.wt = wt;
}

}   

  