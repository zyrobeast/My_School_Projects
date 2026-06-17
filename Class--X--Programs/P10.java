public class P10 {
    public static void main(String[] args) {
        System.out.println();
        for(int a = 1;a <= 4; a++) {
            int c = 1;
            for(int b = 4;b >= 1; b--) {
                if(b <= a) {
                    System.out.print(c);
                    c = c + 1;
                }
                else
                    System.out.print(" ");
            }

            for(int d = a - 1;d > 0; d--)
                System.out.print(d);

            System.out.println();
        }
    }
}