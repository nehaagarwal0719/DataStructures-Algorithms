class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      //add code here.
     // Queue<Integer> res= new LinkedList<>();
      Stack<Integer> st= new Stack<>();
      int r=q.size()-k;
      while(k!=0){
          st.push(q.remove());
          k--;
      }
      while(!st.isEmpty()){
          q.add(st.pop());
      }
      while(!q.isEmpty() && r>0){
          int d=q.remove();
          q.add(d);
          r--;
      }
      return q;
    }
}