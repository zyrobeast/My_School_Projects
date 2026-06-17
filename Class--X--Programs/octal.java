import java.util.*;
class octal  {
    public static void main() {
        System.out.println();
        Scanner oc = new Scanner(System.in);
        int a,b,c,e,d,f,g,h,k,i,j;
        System.out.println("enter 1 for octal and 0 for decimal");
        a = oc.nextInt();
        if(a == 1) {
            System.out.println("enter the number");
            b = oc.nextInt();
            if(b < 8)
                System.out.println("the octal code is 0" + b);
            else {
                c = 1;
                do {
                     d = b % 8;
                     b = (b - d) / 8;
                     c = c * 10 + d;
                }while(b > 8);
                c = c * 10 + b;
                g = 0;
                do {
                    f = c % 10;
                    g = g * 10 + f;
                    c = (c - f) / 10;
                }while(c >0);
                g = (g - 1) / 10;
                System.out.println("the octal code is 0" + g);
            }
        }
        else if (a == 0) {
            System.out.println("enter the octal");
            h = oc.nextInt();
            if(h <= 8)
                System.out.println("the number is " + h);
            else {
                i = 1;
                k = 0;
                do
                {
                    j = h % 10;
                    k = k + (j * i);
                    h = (h - j) / 10;
                    i = i * 8;
                }while(h > 0);
                System.out.println("the number is " + k);
            }
        }
        else
            System.out.println("WRONG INPUT");
    }
}