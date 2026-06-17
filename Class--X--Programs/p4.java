class p4 {
    public static void main() {
        System.out.println();
        int c = 6;
        for (int a = 1; a <= 7; a++) {
            for (int b = 1; b <= c; b++)
                System.out.print("1");

            for (int e = 1; e <= a; e++)
                System.out.print(a);

            System.out.println();
            c = c - 1;
        }
    }
}