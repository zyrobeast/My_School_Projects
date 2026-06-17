import java.util.*;
class large
{
public static void main()
{
Scanner ab=new Scanner(System.in);
System.out.println("Enter the string");
String a=ab.nextLine();
a=a.trim();
a=a+" ";
String b="",largest="";
int max=0;
for(int i=0;i<=a.length()-1;i++)
{
char k=a.charAt(i);
if(k!=' ')
b+=k;
else if(b.length()>max)
{
max=b.length();
largest=b;
b="";
}
else
b="";
}
System.out.println("Largest string="+largest);
System.out.println("characters="+max);
}
}
