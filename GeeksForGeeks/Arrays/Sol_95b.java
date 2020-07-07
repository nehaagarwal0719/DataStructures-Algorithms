import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t>0){
		    int n = Integer.parseInt(br.readLine());
		    String line = br.readLine();
		    String [] str = line.trim().split("\\s+");
		    int [] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=Integer.parseInt(str[i]);
		    }
		   
		    
		    HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
		    
		    int curr_sum = 0;
		    int count = 0;
		    hm.put(0,1);
		    for(int i=0;i<n;i++){
		        curr_sum += arr[i];
		        if(hm.containsKey(curr_sum - 0) ){
		            count += hm.get(curr_sum-0);
		        }
		        
		        if(!hm.containsKey(curr_sum)){
		            hm.put(curr_sum,1);
		        }
		        else{
		            hm.put(curr_sum,hm.get(curr_sum)+1);
		            }
		        
		        
		    }
		    System.out.println(count);
		    
		    t--;
		}
	}
}