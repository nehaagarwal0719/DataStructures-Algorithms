class Geeks{
    
    static void checkString(String s)
{
int v=0;
int c=0;

//Your code here
s = s.replaceAll(" ","");

for (int i = 0; i < s.length(); i++)
{
char ch = s.charAt(i);
//int temp = (int)ch;
if(ch == 'a'||ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u')
v++;
else
c++;
}

if(v>c)
System.out.print("Yes");
else if(c>v)
System.out.print("No");
else
System.out.print("Same");

System.out.println();
}
}
