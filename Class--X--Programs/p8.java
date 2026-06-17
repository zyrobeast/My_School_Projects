class p8 {
    public static void main() {
        System.out.println();
        int c = 0;
        for (int a = 1; a <= 10; a++) {
            for (int b = 1 + c; b <= 10 + c; b++) {
                if (b % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            c = c + 1;
            System.out.println();
        }
    }
}    