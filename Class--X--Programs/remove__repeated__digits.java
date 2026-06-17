import java.util.*;
public class remove__repeated__digits {
    public static void main() {
        Scanner ab = new Scanner(System.in);
        long a,num = 0,count = 0,k = 0;
        System.out.println("Enter the number");
        a = ab.nextLong();
        for(long b = 0;b <= 9; b++) {
            long d = 0;
            if(count == 0)
                num = a;

            do {
               long c = num % 10;
               if(c == b)
                   d = d + 1;
               num = num / 10;
            }while(num > 0);

            if(count == 0)
                num = a;
            else
                num = k;

            if(d > 1) {
                 long num2 = 0;
                 do {
                    long c = num % 10;
                    if(c != b)
                        num2 = num2 * 10 + c;
                    num = num / 10;
                 }while(num > 0);
                 num = num2;
                 k = num;
                 count = count + 1;
            }
        }
        System.out.println("the number is " + num);
     }
}