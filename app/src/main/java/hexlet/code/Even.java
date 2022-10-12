package hexlet.code;

import java.util.Scanner;

public class Even {
    static String name;

    public static void Game() {
        Cli.Hello();
        name = Cli.name;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        for (int i = 0; i < 3; i++) {
            int rnd = (int) (Math.random() * 100);
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
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (j == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
