import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc= new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=T;i++){
		    String str=sc.nextLine();
		    int c=0;
		    int flag=1;
		    //System.out.println(str);
		    for(int j=0;j<str.length();j++){
		         if(str.charAt(j)==' ')
	               flag=1;
	            
	            else if(str.charAt(j)=='\\')   //REMEMBER TO PUT \\
	                {
	                if(j!=str.length()-1)
	                   {
	                    if(str.charAt(j+1)=='t' || str.charAt(j+1)=='n'){
	                        flag=1;
	                        j++;
	                   }
	                }
	             }
                    
                else if (flag==1){
                    flag=0;
                    c++;
                }
                  //System.out.print(str.charAt(j));
                  //System.out.println(c);
		    }
		    System.out.println(c);
		}
	}
}