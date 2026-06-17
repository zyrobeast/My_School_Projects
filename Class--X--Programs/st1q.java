import java.util.*;
public class st1q {
   public static void main() {
       Scanner ab = new Scanner(System.in);
       System.out.println("Enter the String");
       String a = ab.nextLine();
       a = " " + a.trim().toLowerCase() + " ";
       String c = "aeiou";
       System.out.println("The words with all vowels are");
       for(int i = 0;i <= a.length() - 2; i++) {
           if(a.charAt(i) == ' ') {
               int m = i + 1;
               int n = a.indexOf(' ',m);
               boolean k = true;
               for(int s = 0;s <= c.length() - 1; s++) {
                   boolean k2 = false;
                   for(int j = m;j <= n; j++)
                       if(c.charAt(s) == a.charAt(j))
                           k2 = true;

                   if(k2 == false)
                       k = false;
               }
               if(k)
                   System.out.println(a.substring(m,n + 1));
           }
       }
   }
}