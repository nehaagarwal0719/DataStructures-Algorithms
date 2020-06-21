class Solution {
    public int findTargetSumWays(int[] a, int diff) {
        int j,i,S=0;
         int n=a.length;
        
       
        
         for(j=0;j<n;j++){  
		     S+=a[j];
		 } 
        
        if((diff+S )%2!=0)
            return 0;
        
          int target=(diff+S)/2;
        
        if(diff>S)
            return 0;
        
        
            
         int lt[][]= new int[n+1][target+1];  
         lt[0][0]=1;
         for (i = 1; i <= target; i++) 
               lt[0][i] = 0; 
               
            for (i = 1; i <= n; i++) {
                if(a[i-1] == 0)
                lt[i][0] = 2*lt[i - 1][0];
                else
                lt[i][0] = lt[i - 1][0];
            }
                
           
        
         for( i=1;i<=n;i++){
               for(j=1;j<=target;j++){
            
                   if(a[i-1]<=j)
                   lt[i][j]=lt[i-1][j-a[i-1]] + lt[i-1][j] ;
	               else 
	               lt[i][j]=lt[i-1][j];
	               
               }
           }
        
        
       return lt[n][target];   
    }
} 