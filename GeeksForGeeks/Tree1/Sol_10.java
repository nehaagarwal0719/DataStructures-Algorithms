class GFG
{
	public static int findMax(Node root)
	{
	    if(root==null)
	      return 0;
	      
	      int res=root.data;
	     int l=findMax(root.left);
	     int r=findMax(root.right);
	     
	     res=Math.max(l,res);
	     res=Math.max(r,res);
	     
	     return res;
	}
	public static int findMin(Node root)
	{
	    if(root==null)
	      return Integer.MAX_VALUE;
	      
	     int res=root.data; 
	     int l=findMin(root.left);
	     int r=findMin(root.right);
	     
	     res=Math.min(l,res);
	     res=Math.min(r,res);
	     
	     return res;
	}
}