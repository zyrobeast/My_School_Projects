import java.util.*;
public class keep___repeated___digits  {
    public static void main() {
        Scanner ab = new Scanner(System.in);
        long a,num2 = 0;
        System.out.println("Enter the number");
        a = ab.nextLong();
        for(long b = 0;b <= 9; b++) {
           long d = 0,num = a;
           do {
              long c = num % 10;
              if(c == b)
                  d = d + 1;
              num = num / 10;
           }while(num > 0);
           num = a;
           if(d > 1) {
                do {
                   long c = num % 10;
                   if(c == b)
                       num2 =num2 * 10 + c;
                   num = num / 10;
                }while(num > 0);
           }
        }
        System.out.println("the number is " + num2);
    }
}