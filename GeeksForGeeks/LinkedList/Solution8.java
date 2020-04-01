 public static int getNth(Node node, int ind)
    {
       if(ind==1)
        return node.data;
       else
        return getNth(node.next, ind-1);
        
    }