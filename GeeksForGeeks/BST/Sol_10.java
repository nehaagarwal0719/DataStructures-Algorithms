class GfG
{
  
    Node binaryTreeToBST(Node root)
    {
        ArrayList<Integer> al =new ArrayList<>();
      
        convertArr(root,al);
        Collections.sort(al);
        Node n= convert(al,0,al.size()-1);
        return n;
    }
    
     static void convertArr(Node root,ArrayList<Integer> al){
        if(root==null)
         return;
         
        convertArr(root.left,al);
        al.add(root.data);
        convertArr(root.right,al);
         
    }
    public  static Node convert(ArrayList<Integer> al, int l, int r){
	    if(l>r)
	      return null;
	    int mid=(l+r)/2;
	    Node temp=new Node(al.get(mid));
	    
	    temp.left=convert(al,l,mid-1);
	    temp.right=convert(al,mid+1,r);
	    
	    return temp;
	}
    
    
}