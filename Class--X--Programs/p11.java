class p11 {
    public static void main() {
        System.out.println();
        for(int a = 1;a <= 4; a++) {
            for(int b = 4;b >= 1; b--) {
                if(b <= a)
                    System.out.print(b);
                else
                    System.out.print(" ");
            }

            for(int b = 2;b <= a; b++)
                System.out.print(b);

            System.out.println();
        }

        for(int a = 3;a >= 1; a--) {
            for(int b = 4;b >= 1; b--) {
                if(b <= a)
                    System.out.print(b);
                else
                    System.out.print(" ");
            }

            for(int b = 2;b <= a; b++)
                System.out.print(b);

            System.out.println();
        }
    }
}