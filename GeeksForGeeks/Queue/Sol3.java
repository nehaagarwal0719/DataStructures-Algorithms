class GfG{
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.

        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.add(q.poll());
        }
        
        while(!st.isEmpty())
           q.add(st.pop());
        return q;
    }
}