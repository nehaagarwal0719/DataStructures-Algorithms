public static int getCountOfNode(Node root,int l, int h)
{
    //Your code here
    if(root==null)
      return 0;
    
    if(root.data>=l && root.data<=h)
      return getCountOfNode(root.left,l,h)+getCountOfNode(root.right,l,h)+1;  

   else if(root.data<l)
      return getCountOfNode(root.right,l,h);
      
    
      
    else if(root.data>h)
      return getCountOfNode(root.left,l,h); 
     
     return 0; 
      
}
