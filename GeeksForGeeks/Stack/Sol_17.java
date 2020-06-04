class GfG
{
    int minEle;
    Stack<Integer> s=new Stack<>();


    int getMin()
    {
	if(!s.isEmpty())
	   return minEle;
	return -1;   
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here

	int t1=minEle;
	 if(!s.isEmpty()){
	    int t=s.pop();
	     if(t<minEle){
	         minEle=2*minEle-t;
	         return t1;
	     }
	     else
	     return t;
	 }
	return -1;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	 
	    if(!s.isEmpty()){
	         if(x<minEle){
	            
	           s.push(2*x- minEle);
	           minEle=x;
	        }
	        else
	           s.push(x);
	    }
	    else{
	        s.push(x);
	        minEle=x;
	    }
    }	
}

