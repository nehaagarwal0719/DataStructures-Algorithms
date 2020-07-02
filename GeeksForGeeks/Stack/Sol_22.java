class Solution {
    public int maximalRectangle(char[][] M) {
        if(M.length==0)
            return 0;
        
        int n=M.length;
        int a[]=new int[M[0].length],i,j;
        for(i=0;i<M[0].length;i++){
          if(M[0][i]=='0')  
            a[i]=0;
          else
             a[i]=1;
        }
       
        int max= (int)MAH(a,M[0].length);
        //System.out.println(MAH(a,M[0].length));
        for(i=1;i<n;i++){
            for(j=0;j<M[i].length;j++){
                if(M[i][j]!='0')
                  a[j]+=1;
                else
                  a[j]=0;
            }
            //System.out.println(MAH(a,M[i].length));
            max=Math.max(max,(int)MAH(a,M[i].length));
        }
        return (int)max;
        
    }
        public long MAH(int a[], int n){
        int j;
        Stack<Pair> stL = new Stack<>();
		 Stack<Pair> stR = new Stack<>();
		 
		 ArrayList<Long> sbL = new ArrayList<>();
		 ArrayList<Long> sbR = new ArrayList<>();
		 
		 for(j=0;j<n;j++){
		     if(stL.isEmpty())
		        sbL.add((long)-1);
		       
		     else if(!stL.isEmpty() && a[j]>stL.peek().ele)
		             sbL.add(stL.peek().ind);
		           
		     else{         
		         while(!stL.isEmpty() && stL.peek().ele>=a[j])
		            stL.pop();
		        if (stL.isEmpty())
		             sbL.add((long)-1);
		        else
		             sbL.add(stL.peek().ind);
		        }
		     
		     stL.push(new Pair((long)a[j],(long)j));       
		 }
		 
		 for(j=n-1;j>=0;j--){
		     if(stR.isEmpty())
		        sbR.add((long)n);
		       
		     else if(!stR.isEmpty() && a[j]>stR.peek().ele)
		             sbR.add(stR.peek().ind);
		           
		     else{         
		         while(!stR.isEmpty() && stR.peek().ele>=a[j])
		            stR.pop();
		        if (stR.isEmpty())
		             sbR.add((long)a.length);
		        else
		             sbR.add(stR.peek().ind);
		        }
		     
		     stR.push(new Pair((long)a[j],(long)j));       
		 }
		 Collections.reverse(sbR);
         long max=0;
		 for(j=0;j<n;j++)
		   max=Math.max(((sbR.get(j)-sbL.get(j)-1)*a[j]),max);
		 return max;   
    }
}
class Pair implements Comparable<Pair>{
    public long ele, ind;
    public Pair(long A, long B){
        ele = A;ind =B;
    }
    public int compareTo(Pair o) {
			if (this.ele == o.ele) {
				return (this.ind > o.ind) ? 1 : (this.ind == o.ind) ? 0 : -1;
			}else if(this.ele < o.ele) {
				return -1;
			}else {
				return 1;
			}
	}
}  