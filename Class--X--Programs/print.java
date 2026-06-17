class print {
    public static void main() {
        System.out.println();
        int i,j;
        System.out.print("1" + ",");
        for( i = 1;i <= 10; i++) {
            if(i > 1) {
                System.out.print("(");

                for(j = 1;j <= i; j++) {
                    System.out.print(j);
                    if (j < i)
                        System.out.print("+");
                }
                System.out.print(")");

                if (i < 10)
                    System.out.print(",");
            }
        }
    }
}