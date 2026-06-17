import java.util.*;
class book
{
boolean issued;
String book_name,author_name,issue_date;
int nof=0;
public book()
{
Scanner ab=new Scanner(System.in);
System.out.println("Enter the book name.");
book_name=ab.nextLine();
System.out.println("\nEnter the author name.");
author_name=ab.nextLine();
}
public book(String a,String b)
{
book_name=a;
author_name=b;
}
public void issue()
{
Scanner ab=new Scanner(System.in);
System.out.println("\nEnter the issue date\nFor example 10/12/2018.");
issue_date=ab.nextLine();
System.out.println("\nEnter the number of days to issue.\nCost of issuing the book is equal to number of days.\nPenalty will be taken as Rupees 5 each day after the number of days has expired.\n");
nof=ab.nextInt();
issued=true;
}
public void return_book()
{
Scanner ab=new Scanner(System.in);
System.out.println("Enter the return date\nFor example 10/12/2018.");
String return_date=ab.nextLine();
int k=find_no_of_days(issue_date,return_date);
double amount=0.0;
amount=nof;
if(k>nof)
{
k-=nof;
amount+=k*5;
}
System.out.println("\nIssue Date ="+issue_date);
System.out.println("Return Date ="+return_date+"\nNumber of days for which book was issued ="+nof+"\n");
System.out.println("Amount to be paid= "+amount);
System.out.println("Enter any key to continue...");
ab.nextLine();
issued=false;
}
public static int find_no_of_days(String issue_date,String return_date)
{
int day1=Integer.parseInt(issue_date.substring(0,issue_date.indexOf("/")));
int k=issue_date.indexOf("/");
int month1=Integer.parseInt(issue_date.substring(k+1,issue_date.indexOf("/",k+1)));
k=issue_date.indexOf("/",k+1);
int year1=Integer.parseInt(issue_date.substring(k+1,issue_date.length()));
int day2=Integer.parseInt(return_date.substring(0,return_date.indexOf("/")));
int k2=return_date.indexOf("/");
int month2=Integer.parseInt(return_date.substring(k2+1,return_date.indexOf("/",k2+1)));
k2=return_date.indexOf("/",k2+1);
int year2=Integer.parseInt(return_date.substring(k2+1,return_date.length()));
int nof1=0;
int nof2=0;
int m=1;
while(m<=month1)
{
if(m==month1)
nof1+=day1;
else if(m==2&&year1%4==0)
nof1+=29;
else if(m==2)
nof1+=28;
else if(m%2==0)
nof1+=30;
else if(m%2!=0)
nof1+=31;
m++;
}
m=1;
while(year1<=year2)
{
if(m==month2&&year1==year2)
{
nof2+=day2;
m=1;
year1++;
}
else if(m==2&&year1%4==0)
nof2+=29;
else if(m==2)
nof2+=28;
else if(m%2==0)
nof2+=30;
else if(m%2!=0)
nof2+=31;
m++;
if(m==13)
{
m=1;
year1++;
}
}
return (nof2-nof1);
}
}