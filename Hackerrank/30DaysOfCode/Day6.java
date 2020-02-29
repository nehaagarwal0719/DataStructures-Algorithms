import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char s1[]=new char[10000];
        int T= sc.nextInt();
        sc.nextLine();
        String s[] = new String[T];
        int i,j;
        for(i=0;i<T;i++){
            s[i]=sc.nextLine();
        }
        for(i=0;i<T;i++){    
            s1=s[i].toCharArray();
            for(j=0;j<s1.length;j=j+2){
                System.out.print(s1[j]);
            }
              System.out.print(" ");
            for(j=1;j<s1.length;j=j+2){
                System.out.print(s1[j]);
            }
            System.out.println();
        }
    }
}
