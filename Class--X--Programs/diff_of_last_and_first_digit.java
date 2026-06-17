import java.util.*;
class diff_of_last_and_first_digit {
    public static void main(String[] args) {
        System.out.println();
        Scanner ab = new Scanner(System.in);
        long num,first = 0,last = 0,diff;
        System.out.println("Enter the number");
        num = ab.nextLong();
        last = num % 10;
        while(num > 0) {
            if(num <= 9)
                first=num;
            num = num / 10;
        }
        if(last >= first)
            diff = last - first;
        else
            diff = first - last;
        System.out.println("The difference is "+ diff);
    }
}