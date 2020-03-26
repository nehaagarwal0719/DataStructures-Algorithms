public static int size(TreeNode root){
     
    int c=0;
    if(root==null)
     return 0;
    
    return size(root.left) + size(root.right) +1 ;
 
}