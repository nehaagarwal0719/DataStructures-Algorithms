class Tree{
    public void printPaths(Node root){
        int path[]=new int[1000];
        printPathsRecur(root, path,0);
    }
    
    public void  printPathsRecur(Node root, int path[],int len){
        if(root==null)
         return;
         
        path[len]=root.data;
        len++;
        
        if (root.left == null && root.right == null) {
            printArray(path,len); 
        }
        else 
        { 
            /* otherwise try both subtrees */
            printPathsRecur(root.left, path,len); 
            printPathsRecur(root.right, path,len); 
        } 
        
    }
    
    void printArray(int path[], int len)  
    { 
        int i; 
        for (i = 0; i < len; i++)  
        { 
            System.out.print(path[i] + " "); 
        } 
        System.out.print("#"); 
    } 

    
}