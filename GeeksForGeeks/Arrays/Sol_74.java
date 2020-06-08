class GfG
{
    int maxDistance(int a[], int n)
    {
    	 HashMap<Integer,Integer> hm= new HashMap<>();
    	 int max=0;
    	 for(int i=0;i<n;i++){
    	     if(!hm.containsKey(a[i]))
    	         hm.put(a[i],i);
    	     else
    	        max=Math.max(max,i-hm.get(a[i]));
    	 }
	   return max;  
    }
}