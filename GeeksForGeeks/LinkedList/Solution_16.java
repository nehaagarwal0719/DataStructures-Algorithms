class GfG
{
    void deleteNode(Node node)
    {
         
    
         Node nex= node.next;
         
         node.data=nex.data;
         
         node.next=nex.next;
         
         nex=null;
         
    }
}
