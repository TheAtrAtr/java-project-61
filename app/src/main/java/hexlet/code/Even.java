package hexlet.code;

import java.util.Scanner;

public class Even {
    private static final String NAME = Cli.getName();
    public static final int UP_LIMIT = 100;

    public static void game() {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        for (int i = 0; i < Engine.getNumberOfRound(); i++) {
            int rnd = (int) (Math.random() * UP_LIMIT);
            System.out.println("Question: " + rnd);
            boolean b = rnd % 2 == 0;
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if ((b && answer.equals("yes")) || (!b && answer.equals("no"))) {
                System.out.println("Correct!");
                j++;

            } else {
                String s = b ? "yes" : "no";
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.", answer, s);
                System.out.println();
                System.out.println("Let's try again, " + NAME + "!");
                break;
            }
        }
        if (j == Engine.getNumberOfRound()) {
            System.out.println("Congratulations, " + NAME + "!");
        }
    }
}
