import java.util.*;
class Main
{
static book[] books=new book[5];
public static void main(String[] args)
{
load();
Scanner ab=new Scanner(System.in);
do
{
System.out.print("\f");
System.out.println("Books in library.\n");
for(int i=0;i<books.length;i++)
{
String bookn="Book no."+(i+1)+" ="+books[i].book_name+" by "+books[i].author_name;
if(books[i].issued)
bookn+="-Issued";
System.out.println(bookn+"\n");
}
System.out.println("Enter 1 to add a book.");
System.out.println("Enter 2 to remove a book.");
System.out.println("Enter 3 to issue a book.");
System.out.println("Enter 4 to return a book.");
System.out.println("Enter any other number to exit.");
int ch=ab.nextInt();
if(ch==1)
add();
else if(ch==2)
{
System.out.println("Enter the number of book to delete");
int a=ab.nextInt();
remove(a);
}
else if(ch==3)
{
boolean present=false;
for(int i=0;i<books.length;i++)
{
if(!books[i].issued)
{
present=true;
}
}
if(books.length>0&&present)
{
System.out.println("Enter the number of book to issue");
int k=ab.nextInt()-1;
if(books[k].issued)
{
System.out.println("Sorry ! This books is already issued");
for(int i=0;i<=4;i++)
for(int j=0;j<=999999999;j++);
}
else if(k>books.length)
{
System.out.println("Sorry ! This books number is not present");
for(int i=0;i<=4;i++)
for(int j=0;j<=999999999;j++);
}
else
{
books[k].issue();
}
}
else
{
System.out.println("Sorry ! No books to issue");
for(int i=0;i<=4;i++)
for(int j=0;j<=999999999;j++);
}
}
else if(ch==4)
{
if(books.length>0)
{
System.out.println("Enter the number of book to return");
int k=ab.nextInt()-1;
if(!books[k].issued)
{
System.out.println("Sorry ! This books is not issued");
for(int i=0;i<=4;i++)
for(int j=0;j<=999999999;j++);
}
else if(k>books.length)
{
System.out.println("Sorry ! This books number is not present");
for(int i=0;i<=4;i++)
for(int j=0;j<=999999999;j++);
}
else
{
books[k].return_book();
}
}
else
{
System.out.println("Sorry ! No books to return");
for(int i=0;i<=4;i++)
for(int j=0;j<=999999999;j++);
}
}
else
break;
}while(true);
}
public static void load()
{
books[0]=new book("Understanding Bluej","Vijay Kumar Pandey");
books[1]=new book("The Merchant of Venice","Xavier Pinto");
books[2]=new book("Understanding Boxes","<Unknown>");
books[3]=new book("Aditya ki Kahani","Aditya Bubna");
books[4]=new book("Philosopher","Ashutosh Khatua");
}
public static void add()
{
book[] b=new book[books.length+1];
for(int i=0;i<books.length;i++)
b[i]=books[i];
b[books.length]=new book();
books=b;
}
public static void remove(int a)
{
book[]b =new book[books.length-1];
int k=0;
for(int i=0;i<books.length;i++)
{
if(i!=a-1)
{
b[k]=books[i];
k++;
}
}
books=b;
}
}