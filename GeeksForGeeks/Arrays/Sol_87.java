class GfG {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] a, int N) {
        int i,s=0,cs=0,max=0;
        for(i=0;i<N;i++){
            if(a[i]==0)
             s+=-1;
            else
             s+=1;
        }
        if(s==0)
         return N;
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(i=0;i<N;i++){
            if(a[i]==0)
             cs+=-1;
            else
             cs+=1;
            if(cs==0)
             max=Math.max(max,i+1);
            else if(hm.containsKey(cs))
             max=Math.max(max,i-hm.get(cs));
            else 
             hm.put(cs,i);
             
        }
        
        return max;
    }
}