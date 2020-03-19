import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        int no,c=0;
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            no=sc.nextInt();
            c=0;
            if(no!=1){
                for(int j=2;j<=(int)Math.sqrt(no);j++){
                    if(no%j==0)
                        c++; 
                }
                if(c>=1)
                    System.out.println("Not prime");
                else
                    System.out.println("Prime");
            }
            else
                System.out.println("Not prime");
        }
    }
}

