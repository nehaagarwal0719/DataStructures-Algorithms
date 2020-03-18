class MinStack {
    
    ArrayList<Integer> st;
    
    public MinStack() {
        st = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        st.add(x);
    }
    
    public void pop() {
        st.remove(st.size()-1);
    }
    
    public int top() {
        return st.get(st.size()-1);
    }
    
    public int getMin() {
        return Collections.min(st);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
