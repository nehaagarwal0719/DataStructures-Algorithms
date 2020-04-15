public Stack<Integer> deleteMid(Stack<Integer>s,int sizeOfStack,int current)
    {
        //Your code here
        if(s.isEmpty() || current==sizeOfStack)
          return s;
         
         int popped=s.pop();
         
         deleteMid(s,sizeOfStack, current+1);
         
         if(current!=sizeOfStack/2)
           s.push(popped);
         
         return s;  
    } 