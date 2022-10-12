package hexlet.code;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime {
    private static final String name = Cli.name;

    public static void Game() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        for (int i = 0; i < 3; i++) {
            int rnd = (int) (Math.random() * 1000);
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
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (j == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    static boolean primeTest(int x) {
        BigInteger bigInteger = BigInteger.valueOf(x);
        return bigInteger.isProbablePrime((int) Math.log(x));
    }
}
