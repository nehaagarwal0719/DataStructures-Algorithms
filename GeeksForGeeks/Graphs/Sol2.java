class Traversal
{
    ArrayList<Integer> al = new ArrayList<Integer>();
    
     ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
      {
       boolean visited[] = new boolean[N];
       
       visited[0]=true;
       
       DFSUtil(0, visited,g); 
       return al;
      }
    
    void DFSUtil(int v, boolean visited[],ArrayList<ArrayList<Integer>> g){
        visited[v]=true;
        al.add(v);
        
        Iterator<Integer> i = g.get(v).listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                DFSUtil(n, visited,g); 
        } 
        
    }
      
}