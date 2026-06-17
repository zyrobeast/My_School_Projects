import java.util.Scanner;

class Main {
    public static void main() {
        Scanner ab = new Scanner(System.in);
        System.out.println("\fThis is a result automation software made by java.");
        System.out.println("Please enter the number of students.");
        int num = ab.nextInt();
        student stu[] = new student[num];
        for (int i = 0; i < num; i++)
            stu[i] = new student();
        for (int i = 0; i < num; i++) {
            System.out.print("\f");
            System.out.println("Enter the details of student no. " + (i + 1));
            stu[i].initialize();
        }
        for (int i = 0; i < num - 1; i++) {
            int max = i;
            for (int j = i + 1; j < num; j++)
                if (stu[max].avg < stu[j].avg)
                    max = j;
            student k = stu[i];
            stu[i] = stu[max];
            stu[max] = k;
        }
        print.print(stu);
    }
}