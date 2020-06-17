class Solution {
    public List<Integer> findClosestElements(int[] a, int k, int x) {
         PriorityQueue<Pair> heap =new PriorityQueue<>();
        
          for(int j=0;j<a.length;j++){
		     heap.add(new Pair(Math.abs(a[j]-x),a[j]));
		     if(heap.size()>k){
		         heap.remove();
		     }
		 }
		 
         ArrayList<Integer> al = new ArrayList<>();
		 while(heap.size()>0){
		      al.add(heap.peek().val);
		         heap.remove();
		 }
        Collections.sort(al);
        return al;
    }
}

class Pair implements Comparable<Pair>{
    public int diff, val;
    public Pair(int A, int B){
        diff = A;val =B;
    }
    public int compareTo(Pair o) {
			if (this.diff == o.diff) {
				return (this.val < o.val) ? 1 : (this.val == o.val) ? 0 : -1;
			}else if(this.diff < o.diff) {
				return 1;
			}else {
				return -1;
			}
	}
}	