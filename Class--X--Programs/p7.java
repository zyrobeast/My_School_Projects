class p7 {
    public static void main() {
        System.out.println();
        int c = 4;
        for (int a = 1; a <= 5; a++) {
            int e = 0;
            for (int b = 1; b <= a; b++) {
                if (b == 1)
                    e = b * a;
                else {
                    e = e + c;
                    c--;
                }
                System.out.print(e);
            }
            c = 4;
            System.out.println();
        }
    }
}