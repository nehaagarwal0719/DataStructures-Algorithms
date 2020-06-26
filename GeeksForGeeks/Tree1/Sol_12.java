class View
{
    static void topView(Node root)
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
        Map<Integer, Node> tm = new TreeMap<Integer, Node>();
        
        if (root == null) { 
            return; 
        } else { 
            q.add(new QueueObj(root, 0)); 
        }
        
         while (!q.isEmpty()) { 
            QueueObj tmpNode = q.poll(); 
            if (!tm.containsKey(tmpNode.hd)) { 
                tm.put(tmpNode.hd, tmpNode.node); 
            } 
  
            if (tmpNode.node.left != null) { 
                q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1)); 
            } 
            if (tmpNode.node.right != null) { 
                q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1)); 
            } 
  
        } 
        for (Map.Entry<Integer, Node> entry : tm.entrySet()) { 
            System.out.print(entry.getValue().data+" "); 
        } 
        
    }
}