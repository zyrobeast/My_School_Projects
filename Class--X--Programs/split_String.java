class split_String {
    public static void main(String a) {
        final int maxLength = 20;
        while(a.length() > maxLength) {
            int li = a.lastIndexOf(' ',maxLength);
            System.out.println(a.substring(0,li));
            a = a.substring(li + 1);
        }

        System.out.println(a);
    }
}