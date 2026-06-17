class Quiz_Test {
    public static void main(String[] args) {
        Play.load();
        do {
            System.out.println("\f");
            System.out.println("Welcome to this Quiz Contest by Abhisek Singh in bluej environment.\n\n");
            System.out.println("The Rules Are very simple.\n");
            System.out.println("1 >You will have 2 lives.");
            System.out.println("2 >Each right answer will reward you 5 points.");
            System.out.println("3 >Each wrong answer will cost you a life.");
            System.out.println("4 >Answering 5 questions correctly in a row will reward you a life.\n");
            System.out.println("Enter Any Key To Continue...");
            Accept.nextLine();
            Play.shuffle();
            Play.play();
            System.out.println("Enter 1 to play again and any other key to exit...");
        } while (Accept.nextLine().equals("1"));
        System.out.println("Thanks for playing...");
    }
}