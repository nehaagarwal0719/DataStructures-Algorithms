class GfG
{
    public static int preIndex;
    GfG(int ind)
    {
        preIndex = ind;
    }
    
  public static Node buildTree(int ino[], int pre[], int st, int end)
    {
        
       HashMap<Integer,Integer> hm= new HashMap<>();
       for(int i=0;i<ino.length;i++){
            hm.put(ino[i],i);
        }
        
        return build(ino,pre, st, end,hm);
       
    }
    
    public static Node build(int ino[], int pre[], int st, int end, HashMap<Integer,Integer> hm){
        if(st>end)
         return null;
         
        Node temp= new Node(pre[preIndex++]);
        
        if(st==end)
         return temp;
         
        int ind=hm.get(temp.data);
        
        temp.left=build(ino,pre,st,ind-1,hm);
        temp.right=build(ino,pre,ind+1,end,hm);
        
        return temp;
    }