class GfG {
    long minDist(long arr[], long n, long x, long y) {
        // add code here.
        int flag=0;long c=0;long min=Long.MAX_VALUE;long res=0;
        for(int i=0;i<n;i++){
             if((arr[i]==x && flag==2)||(arr[i]==y && flag==1)){
                 res=i-c;          
                 if(res<min)
                  min=res;
                 flag=0; 
             }     
             if(arr[i]==x ){
               flag=1;
                c=i;
            }
            if(arr[i]==y){
               flag=2;
                c=i;
            }
        } 
        if(res>0)
         return min;
       return -1;
    }
}
