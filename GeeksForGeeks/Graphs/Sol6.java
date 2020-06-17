class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int V)
    {
        boolean visited[]= new boolean[V];
        boolean recstk[]=new boolean[V];
        
        for(int i=0;i<V;i++){
            if(check(adj,visited,recstk,i))
               return true;
        }
        return false;
    }
    
    static boolean check(ArrayList<ArrayList<Integer>> g, boolean visited[],boolean recstk[],int n){
        
        if(recstk[n])
          return true;
          
        if (visited[n]) 
            return false;   
          
        visited[n]=true;
        recstk[n]=true;
        
        Iterator<Integer> itr= g.get(n).listIterator();
        
        while(itr.hasNext()){
            int i=itr.next();
            if(check(g,visited,recstk,i))
              return true;
        }
        
        recstk[n]=false;
        return false;
    } 
    
}