import java.util.*;
class fibonacci {
    public static void main() {
        System.out.println();
        Scanner ab = new Scanner(System.in);
        long num = 0,a = 0,b = 1,c = 0;
        System.out.println("Enter the number");
        num = ab.nextLong();
        while(c <= num) {
           System.out.println(c);
           a = b;
           b = c;
           c = a + b;
        }
    }
}
            
