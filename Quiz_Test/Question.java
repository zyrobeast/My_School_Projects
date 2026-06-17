public class Question {
    String question;
    String[] options = new String[4];
    int ca = 0;

    public Question(String a, String b, String c, String d, String e, int k) {
        question = a;
        options[0] = b;
        options[1] = c;
        options[2] = d;
        options[3] = e;
        ca = k;
    }

    public void shuffle() {
        for (int i = 0; i < 21; i++) {
            int k1 = ((int) (Math.random() * 100)) / 25;
            int k2 = ((int) (Math.random() * 100)) / 25;
            String k = options[k1];
            options[k1] = options[k2];
            options[k2] = k;
            if (k1 == ca - 1)
                ca = k2 + 1;
            else if (k2 == ca - 1)
                ca = k1 + 1;
        }
    }
}