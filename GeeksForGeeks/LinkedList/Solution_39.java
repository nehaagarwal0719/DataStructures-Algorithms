


class GfG
{
    int compare(Node node1, Node node2)
    {
      //Your code here
      if(node1==null && node2==null) return 0;

      Node temp1=node1, temp2=node2;
      while(temp1!=null && temp2!=null){
          if(temp1.data>temp2.data)
              return 1;
           if(temp1.data<temp2.data)
              return -1;
            temp1=temp1.next;
            temp2=temp2.next;
      }
      
      return 0;
    }
}