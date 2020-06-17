class Solution {
    ArrayList<Integer> countDistinct(int a[], int n, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> hm= new HashMap<>();
        int i=0;
        for(i=0;i<k;i++){
            if(!hm.containsKey(a[i]))
             hm.put(a[i],1);
            else
             hm.put(a[i],hm.get(a[i])+1);
        }
        al.add(hm.size());
        for(i=k;i<n;i++){
          if(!hm.containsKey(a[i]))
             hm.put(a[i],1);
            else
             hm.put(a[i],hm.get(a[i])+1);
              
          if(hm.containsKey(a[i-k])){
              if(hm.get(a[i-k])>1)
                hm.put(a[i-k],hm.get(a[i-k])-1); 
              else
                hm.remove(a[i-k]);
          }
             
            al.add(hm.size());   
        }
        return al;
    }
}

