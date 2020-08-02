class Tree
{
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
           int ancestors[] = new int[10000+ 1];  
  
    // generate first ancestor array  
    generateArray(root,ancestors);  
  
    // variable to track record of number of  
    // ancestors visited  
    int count = 0;  
  
    while (node!=-1)  
    {  
        node = ancestors[node];  
        count++;  
  
        if(count==k)  
            break;  
    }  
  
    // print Kth ancestor  
    return node;  
        
    }
    static void generateArray(Node root, int ancestors[])  
    {  
    // There will be no ancestor of root node  
    ancestors[root.data] = -1;  
  
 
    Queue<Node> q = new LinkedList<Node> ();  
    q.add(root);  
  
    while(!q.isEmpty())  
    {  
        Node temp = q.peek();  
        q.remove();  
  
        if (temp.left != null)  
        {  
            ancestors[temp.left.data] = temp.data;  
            q.add(temp.left);  
        }  
  
        if (temp.right != null)  
        {  
            ancestors[temp.right.data] = temp.data;  
            q.add(temp.right);  
        }  
    }  
} 
}