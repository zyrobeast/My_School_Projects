class Accept {
    static java.util.Scanner ab = new java.util.Scanner(System.in);

    public static int nextInt() {
        int a = ab.nextInt();
        ab.nextLine();
        return a;
    }

    public static String nextLine() {
        return ab.nextLine();
    }
}