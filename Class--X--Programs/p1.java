class p1 {
    public static void main() {
        System.out.println();
        int c = 0;
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                int e = b + c;
                System.out.print(e);
            }
            c = c + a;
            System.out.println();
        }
    }
}
