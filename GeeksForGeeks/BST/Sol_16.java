class GfG
{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       if(root==null){
           p=s=null;
           return;
       }
       
       if(root.data==key){
           if(root.left!=null){
               Node temp=root.left;
               while(temp.right!=null)
                 temp=temp.right;
               p.pre=temp;     
           }
           
            if(root.right!=null){
               Node temp=root.right;
               while(temp.left!=null)
                 temp=temp.left;
               s.succ=temp;     
           }
           return;
       }
       
       if(root.data> key){
           s.succ=root;
          findPreSuc(root.left,p,s,key);
       }
       else{
           p.pre=root;
           findPreSuc(root.right,p,s,key);
       }   
           
    }
}