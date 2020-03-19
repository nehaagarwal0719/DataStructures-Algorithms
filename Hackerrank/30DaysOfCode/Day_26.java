import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

    int a_day = scan.nextInt();
    int a_month = scan.nextInt();
    int a_year = scan.nextInt();

    int e_day = scan.nextInt();
    int e_month = scan.nextInt();
    int e_year = scan.nextInt();


    int fine=0;

    if(a_year < e_year)
        fine=0;
    else{
        if(a_year > e_year)
            fine=10000;
        else if(a_month > e_month)
            fine=500 * (a_month - e_month);
        else if(a_day > e_day)
            fine=15 * (a_day - e_day);
    }       

    System.out.println(fine);      
    }
}
