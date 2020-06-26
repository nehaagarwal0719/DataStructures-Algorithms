class Tree
{
 
    // Method that returns the bottom view.
    public ArrayList <Integer> bottomView(Node root)
    {
        class QueueObj{
            Node node;
            int hd;
            
            QueueObj(Node n, int h){
                node=n;
                hd=h;
            }
        }
        
        ArrayList<Integer> al =new ArrayList<>();
        Queue<QueueObj> q = new LinkedList<QueueObj>(); 
        Map<Integer, Node> tm = new TreeMap<Integer, Node>();
        
        if (root == null) { 
            return al; 
        } else { 
            q.add(new QueueObj(root, 0)); 
        }
        
         while (!q.isEmpty()) { 
            QueueObj tmpNode = q.poll(); 
            //if (!tm.containsKey(tmpNode.hd)) { 
                tm.put(tmpNode.hd, tmpNode.node); 
           // } 
  
            if (tmpNode.node.left != null) { 
                q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1)); 
            } 
            if (tmpNode.node.right != null) { 
                q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1)); 
            } 
  
        } 
        
        
        for (Map.Entry<Integer, Node> entry : tm.entrySet()) { 
            al.add(entry.getValue().data); 
        } 
        return al;
    }
}