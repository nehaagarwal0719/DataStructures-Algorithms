    static int[] rotLeft(int[] a, int d) {

        int mod = d % a.length; 
      
        // Prints the rotated array from  
        // start position 
        int res[]=new int[a.length];
        for(int i = 0; i < a.length; ++i) 
            res[i]= a[(i + mod) % a.length] ;

         return res;   
                    
          
    }