import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int d=0,c=0,p=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(n!=0){
            d=n%2;
            if(d==1)
                c++;
            else{
                if(c>p)
                  p=c;
                c=0;
            }        
            n=n/2;
        }
        if(c>p)
         p=c;
        System.out.println(p);
        scanner.close();
    }
}
