import java.util.Scanner;

class student {
    String name, gr;
    int rn;
    double sc, maths, lit, comp, sec, arts, avg, tot;

    public void initialize() {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the name.");
        name = ab.nextLine();
        System.out.println("Enter the roll number.");
        rn = ab.nextInt();
        System.out.println("Enter the science marks.");
        sc = ab.nextDouble();
        System.out.println("Enter the maths marks.");
        maths = ab.nextDouble();
        System.out.println("Enter the english marks.");
        lit = ab.nextDouble();
        System.out.println("Enter the computer marks.");
        comp = ab.nextDouble();
        System.out.println("Enter the Hindi/Odia marks.");
        sec = ab.nextDouble();
        System.out.println("Enter the arts marks.");
        arts = ab.nextDouble();
        tot = (sc + maths + lit + comp + sec + arts);
        avg = ((int) ((sc + maths + lit + comp + sec + arts) / 6 * 100)) / 100.0;
        if (avg > 90)
            gr = "A";
        else if (avg > 70)
            gr = "B";
        else if (avg > 50)
            gr = "C";
        else if (avg > 30)
            gr = "D";
        else
            gr = "E";
    }
}