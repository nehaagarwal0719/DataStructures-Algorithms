import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);

        int n,i;

        n=sc.nextInt();
        List<Integer> al=new ArrayList<Integer>();

        for( i=0;i<n;i++){
            al.add(sc.nextInt());
        }

        int q=sc.nextInt();
        for(i=1;i<=q;i++){

        String c1=sc.next();
        if(c1.equals("Insert")){
            int index=sc.nextInt();
            int no=sc.nextInt();
            al.add(index,no);
        }
        else{   
          int pos=sc.nextInt();
          al.remove(pos);
        }
        }
        
        for(Integer j:al){
            System.out.print(j+ " ");
        }

    }
}
