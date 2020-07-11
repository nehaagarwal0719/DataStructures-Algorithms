class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
       return isIdentical(root,root);
    }
    
    
	static boolean isIdentical(Node root1, Node root2)
	{
	    if(root1==null && root2==null) return true;
	    
	    if(root1!=null && root2!=null)
	      return (root1.data==root2.data) && (isIdentical(root1.left,root2.right)) && (isIdentical(root1.right,root2.left));
	    
	    return false;
	    
	}
}