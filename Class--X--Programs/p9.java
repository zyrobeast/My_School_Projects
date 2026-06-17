class p9 {
    public static void main() {
        System.out.println();
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++)
                System.out.print(b);

            for (int c = 6 - a; c > 0; c--)
                System.out.print("*");

            System.out.println();
        }
    }
}