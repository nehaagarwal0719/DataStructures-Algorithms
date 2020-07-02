class Tree{
    public ArrayList <Integer> verticalSum(Node root) {
        
        class QueueN{
           public Node node;
           public int hd;
            
            QueueN(Node n, int h){
                node=n;
                hd=h;
            }
        }    
            
            ArrayList<Integer> al = new ArrayList<>();
            Queue<QueueN> q= new LinkedList<>();
            Map<Integer, Integer> hm= new TreeMap<>();
            
            if(root==null)
            return al;
            else
            q.add( new QueueN(root,0));
            
            while(!q.isEmpty()){
                QueueN tmp=q.poll();
                if(hm.containsKey(tmp.hd)){
                  hm.put(tmp.hd, hm.get(tmp.hd)+tmp.node.data);
                 // System.out.print("ok1");
                }
                else{
                  hm.put(tmp.hd,tmp.node.data);
                  //System.out.print("ok");
                } 
                
                if(tmp.node.left!=null)
                  q.add(new QueueN(tmp.node.left, tmp.hd-1));
                
                if(tmp.node.right!=null)
                  q.add(new QueueN(tmp.node.right, tmp.hd+1));  
                
            }
            for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
                al.add(entry.getValue());
            }
            
            return al;
            
        
    }
}
