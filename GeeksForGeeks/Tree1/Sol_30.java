boolean isIsomorphic(Node a, Node b)  
    { 
          if(a==null && b==null)
         return true;
         
         if(a==null || b==null)
         return false;
         
         if(a.data!=b.data)
          return false;
         
        if(a!=null && b!=null)
         return (isIsomorphic(a.left,b.right) && isIsomorphic(a.right,b.left))
              || (isIsomorphic(a.left,b.left) && isIsomorphic(a.right,b.right));
        
        return false; 
    }