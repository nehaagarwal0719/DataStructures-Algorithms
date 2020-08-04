class BST
{
	
	public static ArrayList<Integer> printCommon(Node root1,Node root2)
    {
        ArrayList<Integer> al = new ArrayList<>();
	      Stack<Integer> s1= new Stack<Integer>();
	      Stack<Integer> s2= new Stack<Integer>();
        printInorder(root1,s1);
        printInorder(root2,s2);

       while(!s1.isEmpty() && !s2.isEmpty()){
           int a=s1.pop();
           int b=s2.pop();
           if(a>b)
             s2.push(b);
           else if(a<b)
             s1.push(a);
            else{
                al.add(a);
            }
       }
       Collections.reverse(al);
        return al;
        
    }
    
    public static void printInorder(Node node, Stack s) 
    { 
        if (node == null) 
            return; 
  
        
        printInorder(node.left,s); 
  
       
        s.push(node.data);
  
     
        printInorder(node.right,s); 
    } 
}
