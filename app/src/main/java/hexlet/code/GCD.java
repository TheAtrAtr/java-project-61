package hexlet.code;

import java.util.Scanner;

public class GCD {
    private static final String NAME = Cli.getName();
    public static final int UP_LIMIT = 100;

    public static void game() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        for (int i = 0; i < Engine.getNumberOfRound(); i++) {
            int rnd1 = (int) (Math.random() * UP_LIMIT);
            int rnd2 = (int) (Math.random() * UP_LIMIT);
            System.out.println("Question: " + rnd1 + " " + rnd2);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            int res = gcd(rnd1, rnd2);
            if (answer == res) {
                System.out.println("Correct!");
                j++;
            } else {
                System.out.println("Question: " + rnd1 + " " + rnd2);
                System.out.print("Your answer: " + answer);
                System.out.println();
                System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d.", answer, res);
                System.out.println();
                System.out.println("Let's try again, " + NAME + "!");
                break;
            }
        }
        if (j == Engine.getNumberOfRound()) {
            System.out.println("Congratulations, " + NAME + "!");
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
