class Tree
{
    int f=0;
    void printSibling(Node root){
        ArrayList<Integer> al= new ArrayList<>();
        print(root,al);
        if(f==0)
         System.out.print(-1);
        else{
            Collections.sort(al);
            for(int i=0;i<al.size();i++)
             System.out.print(al.get(i)+" ");
        } 
    }
    
	void print(Node root, ArrayList<Integer> al)
	{
	    
	    
		if(root==null)
		  return;
		
		else if(root.left!=null && root.right==null){
		    f=1;
		 al.add(root.left.data);
		 print(root.left,al);
		}
		
	    else if(root.left==null && root.right!=null){
	        f=1;
		 al.add(root.right.data);
		 print(root.right,al);
		}
		
		else{
		    print(root.left,al);
		    print(root.right,al);
		}
		
	}
}