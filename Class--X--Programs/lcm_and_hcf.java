import java.io.*;
class lcm_and_hcf {
    public static void main()throws IOException {
        System.out.println();
        int a,b,c,e = 0,f = 0;
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader sa = new BufferedReader(ab);
        System.out.println("Enter first number");
        a = Integer.parseInt(sa.readLine());
        System.out.println("Enter second number");
        b = Integer.parseInt(sa.readLine());
        c = a * b;
        for(int d = 1;d <= c; d++) {
            if((a % d == 0)&&(b % d == 0))
               f = d;

            if ((d % a == 0)&&(d % b == 0)) {
               e = d;
               break;
            }
        }
        System.out.println("The LCM is " + e);
        System.out.println("The HCF is " + f);
    }
}