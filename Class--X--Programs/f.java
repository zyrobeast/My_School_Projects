class f {
    public static void main() {
        System.out.println("\f");
        char b = (char) 65535;
        char a = (char) 635;
        char c = (char) 65335;
        char d = (char) 435;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print(b + " ");
                System.out.print(a + " ");
                System.out.print(c + " ");
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}
