import java.util.*;
class binary {
    public static void main() {
        System.out.println();
        Scanner bi = new Scanner(System.in);
        long a,b,c,e,d,f,g,h,i,k,j,z;
        System.out.println("enter 1 for binary and 0 for decimal");
        a = bi.nextLong();
        if(a == 1) {
            System.out.println("enter the number");
            b = bi.nextLong();
            if(b < 2)
                System.out.println("the binary code is 0" + b);
            else {
                c = 1;
                do {
                    d = b % 2;
                    b =(b - d) / 2;
                    c = c * 10 + d;
                }while(b > 1);
                c = c * 10 + 1;
                g = 0;
                do {
                    f = c % 10;
                    g =g * 10 + f;
                    c =(c - f) / 10;
                }while(c > 0);
                g = (g - 1) / 10;
                System.out.println("the binary code is " + g);
            }
        }
        else if(a == 0) {
            System.out.println("enter the binary:");
            h = bi.nextLong();
            if(h <= 1) {
            System.out.println("the number is " + h);
            }
            else {
                i = 1;
                k = 0;
                do {
                    j = h % 10;
                    if ((j == 0) || (j == 1)) {
                        k = k + (j * i);
                        h = ( h- j) / 10;
                        i = i * 2;
                        z = 1;
                    }
                    else  {
                        System.out.println("this is not a binary number");
                        h = 0;
                        z = 0;
                    }
                }while(h > 0);
                if (z == 1)
                    System.out.println("the number is " + k);
            }
        }
        else
            System.out.println("WRONG INPUT");
    }
}