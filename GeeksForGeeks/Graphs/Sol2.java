class Traversal
{
    static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
       // add your code here
       vis[src]=true;
       System.out.print(src + " ");
       
        Iterator<Integer> i = list.get(src).listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!vis[n]) 
                dfs(n,list, vis); 
        } 
        
    }
}