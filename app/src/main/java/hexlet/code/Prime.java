package hexlet.code;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime {
    private static final String NAME = Cli.getName();
    public static final int UP_LIMIT = 1000;

    public static void game() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        for (int i = 0; i < Engine.getNumberOfRound(); i++) {
            int rnd = (int) (Math.random() * UP_LIMIT);
            System.out.println("Question: " + rnd);
            boolean b = primeTest(rnd);
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

    static boolean primeTest(int x) {
        BigInteger bigInteger = BigInteger.valueOf(x);
        return bigInteger.isProbablePrime((int) Math.log(x));
    }
}
