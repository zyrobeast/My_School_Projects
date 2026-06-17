import java.util.*;
public class sqrt {
    public static void main(String[] args) {
        System.out.println();
        Scanner ab = new Scanner(System.in);
        long a,c = 0,d,e = 0;
        final double k = 100000000000000.0;
        final long m = 14;
        double f;
        System.out.println("enter the number");
        a = ab.nextInt();
        for(int b = 1;b <= a; b++) {
            if(b * b > a) {
                break;
            }
            c = b;
        }
        d  = a - c * c;
        if(d != 0) {
            for(int s = 1;s <= m; s++) {
                d = d * 100;
                for(int l = 0;l <= 9; l++) {
                    if((2 * c * 10 + l) * l > d)
                        break;
                    e = l;
                }
                d = d - (2 * c * 10 + e) * e;
                c = c * 10 + e;
            }
            f = c;
            f = f / k;
            System.out.println("the square root is= " + f);
         }
        else
            System.out.println("the square root is= " + c);
    }
}