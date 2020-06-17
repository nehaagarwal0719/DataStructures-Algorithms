class Traversal {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int N) {
          Queue<Integer> q= new LinkedList<>();
          ArrayList<Integer> res = new ArrayList<>();
          boolean visited[]=new boolean[N];
          
          visited[0]=true;
          q.add(0);
          
          while(!q.isEmpty()){
              int s=q.peek();
              res.add(s);
              q.remove();
              
              Iterator<Integer> itr=g.get(s).listIterator();
              while(itr.hasNext()){
                  int n=itr.next();
                  if(!visited[n]){
                    q.add(n);
                    visited[n]=true;
                  }
              }
          }
        return res;  
    }
}

