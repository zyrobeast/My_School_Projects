class p14 {
    public static void main() {
        System.out.println();
        for(int a = 1;a <= 5; a++) {
            for(int b = 1;b <= a; b++) {
                if(b % 2 == 0)
                    System.out.print("@");
                else
                    System.out.print("$");
            }
            System.out.println();
        }
    }
}