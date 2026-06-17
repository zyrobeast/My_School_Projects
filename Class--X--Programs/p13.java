class p13 {
    public static void main() {
        System.out.println();
        for(int a = 5;a >= 1; a--) {
            for(int b = 5;b >= a; b--)
                System.out.print(b);

            for(int b = a - 1;b > 0; b--)
                System.out.print(a);

            System.out.println();
        }
    }
}