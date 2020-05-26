class Election
{
    static void winner(String a[], int n)
    {
        // add your code
        HashMap<String,Integer> hs = new HashMap<String,Integer>();  
        int i=0,f=0;;
        
        for(i=0;i<n;i++){
          
          if(hs.containsKey(a[i]))
            hs.put(a[i],hs.get(a[i])+1);	
          else
            hs.put(a[i],1);
        }
        
        int maxValue = 0; 
        String winner = ""; 
        for (Map.Entry<String,Integer> entry : hs.entrySet()) 
        { 
            String key  = entry.getKey(); 
            Integer val = entry.getValue(); 
            if (val > maxValue) 
            { 
                maxValue = val; 
                winner = key; 
            } 
  
            else if (val == maxValue && 
                winner.compareTo(key) > 0) 
                winner = key; 
        } 
        System.out.print(winner +" "+maxValue); 
    }
}

