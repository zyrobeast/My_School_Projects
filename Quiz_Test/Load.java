class Load {
    static int x = 0;

    public static void ini() {
        x = 0;
    }

    public static void print() {
        x++;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j <= 99999999; j++) ;
        System.out.println("\f");
        System.out.println("Loading...");
        for (int i = 0; i < 101; i++)
            System.out.print("_");
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i <= x)
                System.out.print("/");
            else
                System.out.print(" ");
        }
        System.out.println("/");
        for (int i = 0; i < 101; i++)
            System.out.print("-");
    }
}