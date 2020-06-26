class BinaryTree
{
    static ArrayList <Integer> verticalOrder(Node root)
    {
      class QueueObj{
            Node node;
            int hd;
            
            QueueObj(Node n, int h){
                node=n;
                hd=h;
            }
        }
        
        Queue<QueueObj> q = new LinkedList<QueueObj>(); 
        Map<Integer, ArrayList<Node>> tm = new TreeMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        if (root == null) { 
            return al; 
        } else { 
            q.add(new QueueObj(root, 0)); 
        }
        
         while (!q.isEmpty()) { 
            QueueObj tmpNode = q.poll(); 
            if (!tm.containsKey(tmpNode.hd)) { 
                tm.put(tmpNode.hd, new ArrayList<>());
                tm.get(tmpNode.hd).add(tmpNode.node);
            } 
            else
               tm.get(tmpNode.hd).add(tmpNode.node);
  
            if (tmpNode.node.left != null) { 
                q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1)); 
            } 
            if (tmpNode.node.right != null) { 
                q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1)); 
            } 
  
        } 
        for (Map.Entry<Integer, ArrayList<Node>> entry : tm.entrySet()) {
                 Iterator<Node> itr = entry.getValue().iterator(); 
                while(itr.hasNext()){
                   al.add(itr.next().data);
                }
        }    
        return al;
    }
}