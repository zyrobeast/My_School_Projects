class p2 {
    public static void main() {
        System.out.println();
        int c = 5, e = 1;
        for (int a = 1; a <= 5; a++) {
            for (int b = 5; b >= 1; b--) {
                if (b <= c)
                    System.out.print(b);
                else
                    System.out.print(" ");
            }

            for (int d = 5; d >= 1; d--) {
                if (d <= e)
                    System.out.print(d);
                else
                    System.out.print(" ");
            }
            System.out.print(" ");

            for (int f = 1; f <= 5; f++) {
                if (f <= e)
                    System.out.print(f);
                else
                    System.out.print(" ");
            }

            for (int h = 1; h <= c; h++)
                System.out.print(h);

            System.out.println();
            c = c - 1;
            e = e + 1;
        }
    }
}