
class GfG
{
    int l=-1;
    
    boolean check(Node root)
    {
      int level=0;
	  return check1(root, level);
	      
    }
    
    boolean check1(Node root, int level){
         if(root==null)
	      return true;
	    
	   if(root.left==null && root.right==null){
	       if(l==-1)
	         l=level;
	         
	       return (l==level);  
	   }   
	   
	   return check1(root.left,level+1) && check1(root.right,level+1);
	   
    }
}
