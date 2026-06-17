class print {
    public static void print(student[] s) {
        System.out.print("\f");
        for (int i = 0; i <= 151; i++)
            System.out.print("_");
        System.out.println();
        System.out.println("|   Rank   |             Name             | Roll no. | Science  |  Maths   | English  | Computer |Hindi\\Odia|   Arts   |   Total  |Percentage|   Grade  |");
        System.out.print("|__________|______________________________|__________|__________|__________|__________|__________|__________|__________|__________|__________|__________|");
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            System.out.print("|");
            System.out.print(i + 1);
            for (int j = 1; j <= 10 - (("" + (i + 1)).length()); j++)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(s[i].name);
            for (int j = 1; j <= 30 - (s[i].name.length()); j++)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(s[i].rn);
            for (int j = 1; j <= 10 - ((s[i].rn + "").length()); j++)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(s[i].sc);
            for (int j = 1; j <= 10 - ((s[i].sc + "").length()); j++)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(s[i].maths);
            for (int j = 1; j <= 10 - ((s[i].maths + "").length()); j++)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(s[i].lit);
            for (int j = 1; j <= 10 - ((s[i].lit + "").length()); j++)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(s[i].comp);
            for (int j = 1; j <= 10 - ((s[i].comp + "").length()); j++)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(s[i].sec);
            for (int j = 1; j <= 10 - ((s[i].sec + "").length()); j++)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(s[i].arts);
            for (int j = 1; j <= 10 - ((s[i].arts + "").length()); j++)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(s[i].tot);
            for (int j = 1; j <= 10 - ((s[i].tot + "").length()); j++)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(s[i].avg);
            for (int j = 1; j <= 10 - ((s[i].avg + "").length()); j++)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(s[i].gr);
            for (int j = 1; j <= 10 - ((s[i].gr + "").length()); j++)
                System.out.print(" ");
            System.out.print("|");
            System.out.println();
            System.out.print("|__________|______________________________|__________|__________|__________|__________|__________|__________|__________|__________|__________|__________|");
            System.out.println();
        }
    }
}