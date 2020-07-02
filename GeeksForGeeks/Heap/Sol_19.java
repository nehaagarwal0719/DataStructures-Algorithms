class Solution{
    public static ArrayList<Integer> mergeKArrays(int[][] a,int k) 
    {
        // Write your code here.
        PriorityQueue<Pair> heap =new PriorityQueue<>(Collections.reverseOrder());
        int i;
        for(i=0;i<k;i++){
            heap.add(new Pair(a[i][0],i));
        } 
        
        int now[]=new int[k];
        Arrays.fill(now,0);
        
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(i=0;i<k*k;i++){
            int data=heap.peek().ele;
            int index=heap.peek().ind;
            heap.remove();
             al.add(data);
            
            if(now[index]<k-1){
                 now[index]++;
                 heap.add(new Pair(a[index][now[index]],index));
            }
           
        }
    
        return al;
        
    }
}

class Pair implements Comparable<Pair>{
    public int ele, ind;
    public Pair(int A, int B){
        ele = A;ind =B;
    }
    public int compareTo(Pair o) {
			/*if (this.ele == o.ele) {
				return (this.val < o.val) ? 1 : (this.val == o.val) ? 0 : -1;
			}else */if(this.ele < o.ele) {
				return 1;
			}else {
				return -1;
			}
	}
}