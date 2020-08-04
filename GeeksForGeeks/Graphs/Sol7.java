/*Topological sorting for Directed Acyclic Graph (DAG) is a linear ordering of vertices such that 
for every directed edge uv, vertex u comes before v in the ordering. Topological Sorting for a graph 
is not possible if the graph is not a DAG.
*/

class TopologicalSort {
    static int[] topoSort(ArrayList<ArrayList<Integer>> adj, int V) {
        // add your code here
        Stack<Integer> stack = new Stack<Integer>();  
    
        // Mark all the vertices as not visited  
        boolean visited[] = new boolean[V]; 
        
          for (int i = 0; i < V; i++)  
            if (visited[i] == false)  
                topologicalSortUtil(i, visited, stack,adj);  
    
        // Print contents of stack  
        int res[]= new int[V],c=0;
        while (stack.empty()==false)  
            res[c++]=stack.pop();
        
       return res; 
    }
    
    static void topologicalSortUtil( int v, boolean visited[],  
                             Stack<Integer> stack,ArrayList<ArrayList<Integer>> adj)  
    {  
        // Mark the current node as visited.  
        visited[v] = true;  
        Integer i;  
    
        Iterator<Integer> it = adj.get(v).iterator();  
        while (it.hasNext())  
        {  
            i = it.next();  
            if (!visited[i])  
                topologicalSortUtil(i, visited, stack,adj);  
        }  
    
        stack.push(v);  
    }  
}