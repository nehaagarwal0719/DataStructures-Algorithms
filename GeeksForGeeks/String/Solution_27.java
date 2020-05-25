import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
	    String s1;
		for(int i=1;i<=T;i++){
		    int n=sc.nextInt();
		    HashMap<String, Integer> hm = new HashMap<String, Integer>();
		    for(int j=1;j<=n;j++){
    		    s1 =sc.next();
    		    char ch[]=s1.toCharArray();
    		    Arrays.sort(ch);
    		    String s= new String(ch);
    		    if(hm.containsKey(s))
    		      hm.put(s,hm.get(s)+1);
    		    else
    		      hm.put(s,1);
		    }
		    
		    ArrayList<Integer> a = new ArrayList<>();
            for(int val: hm.values()){
            a.add(val);
            }
            
            Collections.sort(a);
            
            for(int v:a)
            System.out.print(v+" ");
            
            System.out.println();
		 
		}  
	}
}


// 	time complexity not good