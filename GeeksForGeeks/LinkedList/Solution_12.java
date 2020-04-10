Node sortedMerge(Node A, Node B) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     
       if(A == null) return B; 
        if(B == null) return A; 
          
        if(A.data < B.data)  
        { 
            A.next = sortedMerge(A.next, B); 
            return A; 
        } 
        else 
        { 
            B.next = sortedMerge(A, B.next); 
            return B; 
        } 

   } 