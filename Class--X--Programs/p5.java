class p5 {
    public static void main() {
        System.out.println();
        for (int a = 1; a <= 7; a++) {
            for (int b = 1; b <= a; b++)
                System.out.print(b);

            for (int b = a - 1; b > 0; b--)
                System.out.print(b);

            System.out.println();
        }
    }
}