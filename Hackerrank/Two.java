import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         StringBuilder input1 = new StringBuilder(A); 
         input1= input1.reverse();
         if(A.compareTo(input1.toString())==0)
            System.out.println("Yes");
         else
            System.out.println("No");   
        
    }
}

