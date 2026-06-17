import java.util.*;
class move3 {
    public static void main() {
        Scanner ab = new Scanner(System.in);
        System.out.print("\f");
        System.out.println("Enter the name");
        String an = ab.nextLine();
        System.out.println("\f");
        for(int i = 1;i <= 20; i++) {
            System.out.println("\f");
            for (int j = 1;j <= i; j++)
                System.out.println();
            for (int j = 1;j <= i; j++)
                System.out.print(" ");
            System.out.print(an);
            for(int j = 1;j <= 99999999; j++);
        }
    }
}