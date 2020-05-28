class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = n/k;
         HashMap<Integer,Integer> hm= new HashMap<>();
         for(int i=0;i<n;i++){
           if(hm.containsKey(a[i]))
            hm.put(a[i],hm.get(a[i])+1);	
          else
            hm.put(a[i],1);
         }
          int c = 0; 
         for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
             Integer key  = entry.getKey(); 
            Integer val = entry.getValue(); 
             //System.out.println(c);
            if(val==f)
              c++;
         }
         
         System.out.println(c);
    }
    
}