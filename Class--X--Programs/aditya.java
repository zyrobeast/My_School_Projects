import java.util.*;
class aditya {
    public static void main(String[] args) {
        System.out.print("\f");
        System.out.println("enter the number");
        int a = new Scanner (System.in).nextInt();
        int b = num();
        System.out.println(b);
        System.out.println("enter any number");
        int c = new Scanner (System.in).nextInt();
        int g = num();
        System.out.println(g);
        System.out.println("enter any number");
        int e = new Scanner (System.in).nextInt();
        int f = a - (b + c + e + g);
        System.out.println(f);
        System.out.println(b + "+" + g + "+" + c + "+" + e + "+" + f + " = " + a);
    }

    public static int num() {
        return (int)(Math.random() * 10000);
    }
}