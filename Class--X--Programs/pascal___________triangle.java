import java.util.*;
public class pascal___________triangle {
    String a = "0 1 0 ";
    public static void main() {
        System.out.print("\f");
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the line number");
        int a = ab.nextInt();
        new pascal___________triangle().print(a);;
    }

    public void print(int n) {
        for(int i = 0;i < n; i++) {
            String b = "0 ";
            for(int j = n;j >= i; j--)
                System.out.print(" ");

            for(int j = 0;j <= i; j++) {
                String as = getChar(j) + getChar(j + 1) + " ";
                System.out.print(as);
                b += as;
            }
            b += "0 ";
            a = b;
            System.out.println();
        }
    }

    public int getChar(int a) {
       String k = "";
       int b = a;
       int c = 0;
       for(int i = 0;i < this.a.length() && b > 0; i++) {
           if(this.a.charAt(i)==' ')
               b--;

           c++;
       }

       while(this.a.charAt(c) != ' ') {
           k += this.a.charAt(c);
           c++;
       }
       return (Integer.parseInt(k));
    }
}