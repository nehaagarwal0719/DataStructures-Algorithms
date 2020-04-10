class Traversal
{
    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov)
    {
       // add your code here
       vis[s]=true;
       
       LinkedList<Integer> queue = new LinkedList<Integer>(); 
       
       queue.add(s);
       
       while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            s = queue.poll(); 
            System.out.print(s+" "); 
  
            Iterator<Integer> i = list.get(s).listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!vis[n]) 
                { 
                    vis[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    }
}



