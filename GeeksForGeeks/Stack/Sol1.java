class MyStack {

    // Note that top is by default null
    // in Java
    StackNode top;

    void push(int a) {
        // Add your code here
        StackNode temp=new StackNode(a);
        temp.next=top;
        top=temp;
    }
    int pop() {
        // Add your code here
        int popped = 0; 
        if (top == null) { 
            return -1; 
        } 
        else { 
            popped = top.data; 
            top = top.next; 
        } 
        return popped; 

        }
} 
 