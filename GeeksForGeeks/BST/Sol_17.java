class Solution {
    public TreeNode bstFromPreorder(int[] pre) {
     return construct(pre,pre[0],Integer.MIN_VALUE,Integer.MAX_VALUE,pre.length);   
    }
    int ind=0; // taken global because otherwise value changes during rec
    
    TreeNode construct(int pre[],int key,int min,int max,int size){
        if(ind>=size)
            return null;
        TreeNode root=null;
        
        if(key>min && key<max){
            root=new TreeNode(key);
            ind++;
            if(ind<size){
                root.left=construct(pre,pre[ind],min,key,size);
            
            }
             if(ind<size){
                //checking again because maybe after recursion of left it becomes greater than size
                root.right=construct(pre,pre[ind],key,max,size);
            }
        }
        return root;
    } 
}