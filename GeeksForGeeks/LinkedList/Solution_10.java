class GfG
{
    public static int frequency(Node node, int search)
    {
        if(node==null)
          return 0;
          
        if(node.data==search)
          return frequency(node.next,search)+1;
          
        return frequency(node.next,search) ; 
    }
}