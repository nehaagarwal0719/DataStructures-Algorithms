import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
	
		int T=sc.nextInt();
		
		for(int d=1;d<=T;d++){
	        int n=sc.nextInt();
	        
		 int a[] = new int[n],j;
		HashMap<Integer,Integer> hm=new HashMap<>();
		
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(hm.containsKey(a[i]))
                hm.put(a[i],hm.get(a[i])+1);
            else
                hm.put(a[i],1);
        }
		 
		PriorityQueue<Pair> heap =new PriorityQueue<>();
        
        for (Map.Entry mapElement : hm.entrySet()) { 
            int key = (int)mapElement.getKey(); 
            int value = (int)mapElement.getValue(); 
		     heap.add(new Pair(value,key));
        } 
        StringBuilder res=new StringBuilder();
        
        while(heap.size()>0){
            for(int y=0;y<heap.peek().f;y++)
		      res.append(heap.peek().val+" ");
		    heap.remove();
		 }
        
         System.out.println(res);
		}
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
			}else if(this.f < o.f) {
				return 1;
			}else {
				return -1;
			}
	}
}	