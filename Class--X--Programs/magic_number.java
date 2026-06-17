import java.util.*;
class magic_number {
    public static void main() {
        Scanner ab = new Scanner(System.in);
        System.out.println("enter the number");
        int a = ab.nextInt();
        while(a % 10 != a) {
            int b = 0;
            do {
                b = b + (a % 10);
                a /= 10;
            }while(a > 0);
            a = b;
        }
        if(a == 1)
            System.out.println("magic number");
        else
            System.out.println("mot a magic number");
    }
}