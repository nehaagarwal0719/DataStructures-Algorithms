 HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
		    
		    int curr_sum = 0;
		    int max = 0;
		    hm.put(0,-1);
		    for(int i=0;i<n;i++){
		        curr_sum += arr[i];
		        
		        if (arr[i] == 0 && max == 0) 
                    max = 1; 
		        if(curr_sum==0)
		         max=i+1;
		         
		        if(hm.containsKey(curr_sum) ){
		             max=Math.max(max,i-hm.get(curr_sum));
		        }
		        
		       else  if(!hm.containsKey(curr_sum)){
		            hm.put(curr_sum,i);
		          //  max=Math.max(max,i);
		        }
		    }
        return max;