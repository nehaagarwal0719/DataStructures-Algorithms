import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.nextLine();
while(n-->0)
{
String s=sc.nextLine();
String old=sc.nextLine();
String ne=sc.nextLine();
System.out.println(s.replaceAll(old,ne));
}
}
}