public static void sort012(int a[], int n){
       
       int count0=0,count1=0,count2=0;  
       int j;
       
       for(j=0;j<n;j++){
           if(a[j]==0)
            count0++;
           else if(a[j]==1)
            count1++;
           else
            count2++;
       }    
       
       int i = 0; 
      
        while (count0 > 0) { 
            a[i++] = 0; 
            count0--; 
        } 
      

        while (count1 > 0) { 
            a[i++] = 1; 
            count1--; 
        } 
      
        while (count2 > 0) { 
            a[i++] = 2; 
            count2--; 
        } 
}