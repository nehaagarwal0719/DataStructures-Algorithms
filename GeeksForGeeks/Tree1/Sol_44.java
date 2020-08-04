//https://www.youtube.com/watch?v=FsxTX7-yhOw
// see if you can understand the brute force methods


class GfG
{
    Node head=null;
    	Node prev=null;
    Node bToDLL(Node root)
    {
        head=bToDLLhelper(root);
        return head;
	
    }
    Node bToDLLhelper(Node root)
    {
	//  Your code here	
	if(root==null)
	  return null;
	bToDLLhelper(root.left);
	
	if(prev==null)
	  head=root;
	 else{
	      root.left = prev; 
          prev.right = root; 
	 } 
	prev=root;
	
	
	bToDLLhelper(root.right);
	return head;
    }
}