class p15 {
    public static void main() {
        System.out.println();
        for(int a = 1;a <= 9;a = a + 2) {
            for(int b = a;b <= 9;b = b + 2)
                System.out.print(b);

            for(int b = a - 2;b > 0;b = b - 2)
                System.out.print(b);

            System.out.println();
        }
    }
}