import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int k=1;k<=T;k++){
		    int v=sc.nextInt();
		    int e=sc.nextInt();
		    
		    ArrayList<ArrayList<Integer> > al
                    = new ArrayList<ArrayList<Integer> >(); 
            
            int i;        
            
            for(i=0;i<v;i++){
              al.add(new ArrayList<Integer>());    
            }
            
            for(i=0;i<e;i++){
                int v1=sc.nextInt();
                int v2=sc.nextInt();
                al.get(v1).add(v2);
                al.get(v2).add(v1);
            }        
            
            for(i=0;i<al.size();i++){
                String res="";
                res+=i;
                for(int j=0;j<al.get(i).size();j++)
                  res+="-> "+al.get(i).get(j);
                System.out.println(res);
            }
          
		}
	}
}