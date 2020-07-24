class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
          //add code here.
          long res1=0,res2=0;
          
          while(l1!=null){
              //System.out.println("d"+l1.data);
              res1=(res1*10)%1000000007+l1.data;
             // System.out.println("h"+res1);
              l1=l1.next;
              
          }
          
          while(l2!=null){
              res2=(res2*10)%1000000007+l2.data;
              l2=l2.next;
          }
         // System.out.println(res1+" "+res2);
          long res=(res1%1000000007)*(res2%1000000007);
          
          return res%1000000007;
   }
}