import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int j=scan.nextInt();
        double d1=scan.nextDouble();
        scan.nextLine();
        String st=scan.nextLine();
      
        System.out.println(i+j);
        System.out.println(d+d1);
        System.out.println(s+st);

        scan.close();
    }
}
