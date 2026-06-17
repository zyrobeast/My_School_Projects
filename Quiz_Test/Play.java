class Play {
    static Question[] ques = new Question[50];

    public static void shuffle() {
        for (int i = 0; i < 50; i++)
            ques[i].shuffle();
        shuffle_q();
    }

    public static void shuffle_q() {
        for (int i = 0; i < 100; i++) {
            int k1 = (int) ((Math.random() * 100) / 2);
            int k2 = (int) ((Math.random() * 100) / 2);
            Question k = ques[k1];
            ques[k1] = ques[k2];
            ques[k2] = k;
            Load.print();
        }
        Load.ini();
        System.out.println("\nYour Quiz is Loaded.\nEnter any key to continue...");
        Accept.nextLine();
    }

    public static void play() {
        int score = 0, lives = 2, row = 0;
        for (int i = 0; i < 50; i++) {
            System.out.println("\f");
            System.out.println("**********************Question no." + (i + 1) + "**********************");
            System.out.println("Lives- " + lives);
            System.out.println("Score- " + score + "\n");
            System.out.println(ques[i].question + "\n");
            System.out.println("1 >" + ques[i].options[0]);
            System.out.println("2 >" + ques[i].options[1]);
            System.out.println("3 >" + ques[i].options[2]);
            System.out.println("4 >" + ques[i].options[3] + "\n");
            System.out.println("Enter corresponding number to answer.");
            int a = Accept.nextInt();
            if (a == ques[i].ca) {
                score += 5;
                System.out.println("\nRight Answer.");
                row++;
                if (row == 5) {
                    lives++;
                    row = 0;
                }
            } else {
                lives--;
                row = 0;
                System.out.println("\nWrong Answer.\nThe Right Answer is " + ques[i].options[ques[i].ca - 1] + ".");
            }
            for (int m = 0; m < 7; m++)
                for (int n = 0; n < 999999999; n++) ;
            if (lives <= 0) {
                System.out.println("\f\nYour Score =" + score);
                String remarks = "";
                if (score < 50)
                    remarks = "You need to study more";
                else if (score < 100)
                    remarks = "You could do much better.";
                else if (score < 150)
                    remarks = "Very Good! Keep it up.";
                else if (score < 200)
                    remarks = "You have a good mind.";
                else if (score < 250)
                    remarks = "You are a genius.";
                System.out.println(remarks + "\n");
                for (int m = 0; m < 7; m++)
                    for (int n = 0; n < 999999999; n++) ;
                return;
            }
        }
        System.out.println("\f\nSorry you have reached the maximum number of questions.\n\nYou are a genius.");
        for (int m = 0; m < 7; m++)
            for (int n = 0; n < 999999999; n++) ;
    }

    public static void load() {
        ques[0] = new Question("Name the Capital Of India.", "New Delhi", "Mumbai", "Balasore", "Rourkela", 1);
        ques[1] = new Question("Which is the longest snake in India.", "King Cobra", "Pied Viper", "Anaconda", "Red-Eye Snake", 1);
        ques[2] = new Question("Name the Chemical for which urine is yellow.", "Urochome", "Melanin", "ACT", "ADT", 1);
        ques[3] = new Question("Where did the third BRICS Film Festival 2018 held ?", "Shanghai", "Goa", "Rio De Janeiro", "Durban", 4);
        ques[4] = new Question("On which date was the International Tiger Day held.", "July 26", "July 27", "July 28", "July 29", 4);
        ques[5] = new Question("Which of the following has launched the \"Mission SatyaNishta\" ?", "ONGC", "Indian Railway", "CBI", "Union Minister Of Power", 2);
        ques[6] = new Question("Which country was affected by Typhoon Jongdari in the last week of July 2018 ?", "Taiwan", "South Korea", "Indonesia", "Japan", 4);
        ques[7] = new Question("Which two countries were fighting for the border town of Badme, \nwhich has been settled now ?", "Kenya And Nigeria", "Ethopia And Eritrea", "Somalia And Ethopia", "Nigeria And Eritrea", 2);
        ques[8] = new Question("On which day World Hepatitis Day observed.", "July 26", "July 27", "July 28", "July 25", 3);
        ques[9] = new Question("Bhabha-Newton partnership is associated with:-", "India-Germany", "India-UK", "India-USA", "India-Israeli", 2);
        ques[10] = new Question("Where was the Global Disability Summit held on July 24,2018 ?", "London", "Paris", "New York", "Berlin", 1);
        ques[11] = new Question("Which of the following was based with formalin recently ?", "Fish", "Chicken", "Pig", "Egg", 1);
        ques[12] = new Question("Where is the 10th BRICS summit is being held between 25-27 July,2018 ?", "Beijing", "Johannesburg", "New Delhi", "Rio De Janeiro", 2);
        ques[13] = new Question("Which one of he following type of laser is used in laser printers ?", "Semi-Conductor laser", "Excimer Laser", "Dye Laser", "Gas laser", 1);
        ques[14] = new Question("A baby blue whale drinks how many litres of milk per day ?", "500", "234", "239", "190", 4);
        ques[15] = new Question("Who invented the geo-desis dome ?", "Samuel Fuller", "R.Buckminister Fuller", "Albert Einstein", "Samuel Morse", 2);
        ques[16] = new Question("Which of the following technological developments came first ?", "Telegraph", "Telephone", "Teletype", "Telescope", 4);
        ques[17] = new Question("When was the first plastic made artificial materials patented ?", "1909", "1920", "1928", "2001", 1);
        ques[18] = new Question("Moths are a member of what order ?", "Leprosy", "Lepidoptera", "Octagon", "Optica", 2);
        ques[19] = new Question("Study of glands is called ?", "Adenology", "Agonomy", "Aerdonetics", "Aceology", 1);
        ques[20] = new Question("Study of agricultural soils ?", "Agrology", "Agrobiology", "Agronomics", "Agrostology", 1);
        ques[21] = new Question("Which of the following is on the top of reactivity series ?", "Pottasium", "Caesium", "Rubidium", "Sodium", 2);
        ques[22] = new Question("Which of the following is not a metal ?", "Sodium", "Caesium", "Sulphur", "Magnesium", 3);
        ques[23] = new Question("How many computer languages are in use ?", "less than 5000", "50", "nearly 20", "nearly 2000", 4);
        ques[24] = new Question("Which of these is not a early computer ?", "UNIVAC", "ENIAC", "SAGE", "KASA", 4);
        ques[25] = new Question("Which one of the following is the first search engine in Internet ?", "Google", "Archie", "Altavista", "WAIS", 2);
        ques[26] = new Question("Number of bit used by IPV6 address ?", "32", "64", "128", "256", 3);
        ques[27] = new Question("First Computer Virus is ?", "Rabbit", "Creeper Virus", "Elk Cloner", "SCA Virus", 2);
        ques[28] = new Question("Which programming language is exclusively used for artificial intelligence ?", "C", "Java", "J2EE", "Prolog", 4);
        ques[29] = new Question("A dual layer Blue-Ray Disc can store data upto ?", "20 GB", "35 GB", "12 GB", "50 GB", 4);
        ques[30] = new Question("No. of layers in the OSI Model ?", "9", "3", "7", "11", 3);
        ques[31] = new Question("1024 bit is equal to how many byte ?", "1", "32", "128", "64", 3);
        ques[32] = new Question("Which country produces most potatoes ?", "China", "United States", "Ireland", "Russia", 1);
        ques[33] = new Question("In the drink called a zombie ,what is the main alcoholic incredient ?", "Beer", "Brandy", "Rum", "Whiskey", 3);
        ques[34] = new Question("Which is the main incredient of vichyssoise ?", "Lima beans", "Clams", "Tomatoes", "Potatoes", 4);
        ques[35] = new Question("What soft-drink company introduced the brand \"Slice\" ?", "Dr. Pepper", "Coco-Cola", "Seven-Up", "Pepsica", 2);
        ques[36] = new Question("Marzipanis made with what kind of nut ?", "Almond", "Walnut", "Cashew", "Pecan", 1);
        ques[37] = new Question("Europeans first learned of chocolate from whom ?", "Indians", "Africans", "Aztecs", "East Indians", 3);
        ques[38] = new Question("What do you call homemade cheese ?", "Dahi", "Pury", "Paneer", "Ghee", 3);
        ques[39] = new Question("When was milk tray first introduced ?", "1942", "1915", "1923", "1934", 2);
        ques[40] = new Question("Lassi is a drink made from what diary product ?", "Yoghurt", "Heavy Cream", "Cream Cheese", "Butter Milk", 1);
        ques[41] = new Question("Today Cadbury uses high quality beans from which location ?", "West Africa", "South America", "North Africa", "India", 1);
        ques[42] = new Question("What is the highest point on earth ?", "Mt.Everest", "Malabar hills", "Anamalai", "Anaimudi", 1);
        ques[43] = new Question("Einstein is related to ?", "Physics", "Biology", "Chemistry", "Computer", 1);
        ques[44] = new Question("Most Powerful character in anime series \"Dragon Ball\" ?", "Zenoh", "Beerus", "Goku", "Whis", 1);
        ques[45] = new Question("Windows is associated with ?", "Microsoft", "Apple", "Facebook", "Google", 1);
        ques[46] = new Question("Which is the odd one out ?", "Melanin", "Pepsin", "Caesein", "Saliva", 1);
        ques[47] = new Question("Which water-body is on the east of India ?", "Bay Of Bengal", "Arabian Sea", "Indian Sea", "Antarctic Ocean", 1);
        ques[48] = new Question("Which among the following is voluntary ?", "Writing", "Sneezing", "Coughing", "Taking the hand away on touching a hot object", 1);
        ques[49] = new Question("Which of the following is not a java library-class", "Display", "List", "Annotiation", "PrintWriter", 1);
    }
}