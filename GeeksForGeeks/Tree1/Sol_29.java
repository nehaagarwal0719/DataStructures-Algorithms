class Tree {
    boolean areMirror(Node a, Node b) {
        // Your code here
        if(a==null && b==null)
         return true;
         
        if(a!=null && b!=null)
         return (a.data==b.data) && areMirror(a.left,b.right) && areMirror(a.right,b.left);
        
        return false; 
    }
}