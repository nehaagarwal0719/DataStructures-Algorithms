class Solution {
    public int countElements(int[] arr) {
        HashSet<Integer> hs= new HashSet<Integer>();
        
        int c=0;
        
        for(int i=0;i<arr.length;i++)      
             hs.add(arr[i]);
       
        for(int i=0;i<arr.length;i++){
            
            if(hs.contains(arr[i]+1))
                    c++;
            }
               
        
        return c;
    }
}