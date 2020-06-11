class Solution 
{ 
	public static long[] productExceptSelf(int a[], int n) 
	{ 
        // code here
        
        long p=1;
        int f=0;
        long res[]=new long[n];
        for(int i=0;i<n;i++){
            if(a[i]!=0)
             p=p*a[i];
             else
              f++;
        }
        
        for(int i=0;i<n;i++){
            if(f==0)
             res[i]=p/a[i];
            else if(f==1){
                if(a[i]!=0)
                  res[i]=0;
                else
                  res[i]=p;
            }
            else
               res[i]=0;
            
        }
      return res;  
	} 
} 


//IF RETURN ARRRAY WOULD HAVE BEEN THEN COULD DO CHANGES IN A ONLY