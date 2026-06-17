import java.util.*;
class largest {
    public static void main() {
        System.out.println();
        long max = 0,min = 0;
        Scanner ab = new Scanner(System.in);
        for(int a = 1;a <= 10; a++) {
            System.out.println("Enter the number");
            long b = ab.nextLong();
            if(a == 1) {
                max = b;
                min = b;
            }
            if(b >= max)
                max = b;
            if(b <= min)
                min = b;
        }
        System.out.println("The maximum number is " + max);
        System.out.println("The mininum number is " + min);
    }
}