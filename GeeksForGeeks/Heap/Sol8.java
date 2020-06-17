class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        
        PriorityQueue<Pair> heap =new PriorityQueue<>();
        
        for (Map.Entry mapElement : hm.entrySet()) { 
            int key = (int)mapElement.getKey(); 
            int value = (int)mapElement.getValue(); 
            
            
		     heap.add(new Pair(value,key));
		     if(heap.size()>k){
		         heap.remove();
		     }  
        } 
        
        int a[]= new int[k];
		int j=0;
		 while(heap.size()>0){
		      a[j]=heap.peek().val;
             j++;
		         heap.remove();
		 }
        return a;
            
    }
}

class Pair implements Comparable<Pair>{
    public int f, val;
    public Pair(int A, int B){
        f = A;val =B;
    }
    public int compareTo(Pair o) {
			if (this.f == o.f) {
				return (this.val > o.val) ? 1 : (this.val == o.val) ? 0 : -1;
			}else if(this.f > o.f) {
				return 1;
			}else {
				return -1;
			}
	}
}	