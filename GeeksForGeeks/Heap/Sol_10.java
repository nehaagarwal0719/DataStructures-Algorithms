class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
         PriorityQueue<Pair> heap =new PriorityQueue<>();
         for(int i=0;i<points.length;i++){
    
            heap.add(new Pair(points[i][0]*points[i][0]+points[i][1]*points[i][1],
                                  i));
            if(heap.size()>k)
		      heap.remove();
         }
        
        
        int a[][]= new int[k][2];
		int j=0;
		 while(heap.size()>0){
		      int pos =heap.peek().val;
              a[j][0]=points[pos][0];
              a[j][1]=points[pos][1];    
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
				return (this.val < o.val) ? 1 : (this.val == o.val) ? 0 : -1;
			}else if(this.f < o.f) {
				return 1;
			}else {
				return -1;
			}
	}
}	