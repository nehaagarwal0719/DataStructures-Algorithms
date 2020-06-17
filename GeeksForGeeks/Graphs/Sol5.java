class MotherVertex
{   
   
    static int findMother(ArrayList<ArrayList<Integer>> g, int n)
    {
      boolean visited[]= new boolean[n];
      int v=0;
      for(int i=0;i<n;i++){
         if(!visited[i]){
             DFSUtil(i,g,visited);
             v=i;
         }
      }
      
      Arrays.fill(visited,false);
      DFSUtil(v,g,visited);
      for(int j=0;j<n;j++){
          if(!visited[j])
           return -1;
      }
      return v;
    }
    
    static void DFSUtil(int n,ArrayList<ArrayList<Integer>> g, boolean visited[]){
    
        visited[n]=true;

        Iterator<Integer> itr=g.get(n).listIterator();
        while(itr.hasNext()){
            int a=itr.next();
            if(!visited[a])
              DFSUtil(a,g,visited);
        }
       
    }
}
