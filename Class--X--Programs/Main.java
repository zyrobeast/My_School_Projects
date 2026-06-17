import java.util.*;
class Main {
    public static void main(String[] rags) {
        try {
            accept();
        }
        catch(exception e) {//if you enter khyatishree then control comes here
        }
    }

    public static void accept() throws exception {
        exception k;
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter your name");
        String a=ab.nextLine();
        if(a.equalsIgnoreCase("Khyatishree")) {
            k=new exception();
            throw k;//control exits this method unconditionally if you enter khyatishree
        }
        else
            System.out.println("Your name is "+a);
    }
}
