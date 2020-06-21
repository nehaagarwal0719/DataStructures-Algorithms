class Geeks{
    

    static void insert(PriorityQueue<Integer> q, int k){
        

        q.add(k);
    }
    
    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k){
        
        if(k==q.peek())
           return true;
        else{   
            Iterator<Integer> itr = q.iterator(); 
            while (itr.hasNext()){ 
            if(itr.next()==k)
             return true;
            }
        }
        return false;
    }
    
    // Function to delete the element from queue
    static int delete(PriorityQueue<Integer> q){

        int ans=q.peek();
        q.remove();
        return ans;
    }
    
}