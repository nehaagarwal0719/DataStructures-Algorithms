import java.util.*;
import java.lang.*;
import java.io.*;
class HuffmanNode { 
                int data; 
                char c; 
  
                HuffmanNode left; 
                HuffmanNode right; 
                
                
    }
    
class MyComparator implements Comparator<HuffmanNode> { 
    public int compare(HuffmanNode x, HuffmanNode y) 
    { 
        int cmp = x.data - y.data;
        return cmp != 0 ? cmp : 1;                  
    } 
}     
    
class GFG
 {
        
	public static void main (String[] args)
	 {
        
	   Scanner sc = new Scanner(System.in);
		
		int T=sc.nextInt();
		int j;
		
		for(int i=1;i<=T;i++){
		    String s=sc.next();
		    char ch[]=s.toCharArray();
		    int n=ch.length;
	
		 int f[] = new int[n];
		 
		 for(j=0;j<n;j++){
		     f[j]=sc.nextInt();
		 } 
		 
		 PriorityQueue<HuffmanNode> q 
            = new PriorityQueue<HuffmanNode>(n, new MyComparator()); 
            
         for (j = 0; j < n; j++) { 
   
            HuffmanNode hn = new HuffmanNode(); 
  
            hn.c = ch[j]; 
            hn.data = f[j]; 
  
            hn.left = null; 
            hn.right = null; 
  
            q.add(hn); 
        }  
        
        HuffmanNode root = null; 
 
        while (q.size() > 1) { 
  
     
            HuffmanNode x = q.remove();
            HuffmanNode y = q.remove(); 
  

            HuffmanNode temp = new HuffmanNode(); 

            temp.data = x.data + y.data; 
            temp.c = '-';
            temp.left = x; 
            temp.right = y; 
            root = temp; 
            q.add(temp); 
        } 
        
          printCode(root, ""); 
          System.out.println();
            
		}
	 }
	 
	  public static void printCode(HuffmanNode root, String s) 
    { 
  
        if (root.left == null && root.right == null && Character.isLetter(root.c)) { 
            System.out.print(s+" "); 
            return; 
        } 
        printCode(root.left, s + "0"); 
        printCode(root.right, s + "1"); 
    } 
}