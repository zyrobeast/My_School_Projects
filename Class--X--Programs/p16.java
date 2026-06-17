class p16 {
    public static void main() {
        System.out.println();
        for(int a = 1;a <= 4; a++) {
            int d = 1;
            for(int b = 4;b >= 1; b--) {
                if(b <= a) {
                    System.out.print(d);
                    d = d + 1;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}