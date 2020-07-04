static boolean findsum(int a[],int n)
{ 
    int i;

    
    HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
   
    int sum=0;
    
    for(i=0;i<n;i++){
        sum+=a[i];
        if(hm.containsKey(sum)|| a[i]==0 || sum==0)
             return true;
        else
           hm.put(sum,1);
    }
    
    return false;
}

//can use hashset