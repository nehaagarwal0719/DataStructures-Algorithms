class subset 
    { 
    int parent; 
    int rank; 
    } 
  
class DetectCycle
{
   
     boolean isCyclic(ArrayList<ArrayList<Integer>> g, int V)
    {
       // add your code here
       subset subsets[]=new subset[V];
       
       for (int i = 0; i < V; i++) 
        { 
  
        subsets[i] = new subset(); 
        subsets[i].parent = i; 
        subsets[i].rank = 0; 
         } 
        
        int E=0;
        
        for (int i = 0; i < V; i++) 
          E += g.get(i).size(); 
        E=E/2;    
         
         for (int e = 0; e < V; e++) {
         for(int k=0;k<g.get(e).size();k++)   
                  { 
            int x = find(subsets, e); 
            int y = find(subsets, g.get(e).get(k)); 
            if(x == y) 
                return true; 
            union(subsets, x, y); 
              } 
         }
         
            
          return false;
    }
    
    int find(subset [] subsets , int i) 
    { 
    if (subsets[i].parent != i) 
        subsets[i].parent = find(subsets,  
                                 subsets[i].parent); 
        return subsets[i].parent; 
    } 
    
    void union(subset [] subsets,  
           int x , int y ) 
    { 
        int xroot = find(subsets, x); 
            int yroot = find(subsets, y); 
      
        if (subsets[xroot].rank < subsets[yroot].rank) 
            subsets[xroot].parent = yroot; 
        else if (subsets[yroot].rank < subsets[xroot].rank) 
            subsets[yroot].parent = xroot; 
        else
        { 
            subsets[xroot].parent = yroot; 
            subsets[yroot].rank++; 
        } 
    }
    
}