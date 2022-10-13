package hexlet.code;

import java.util.Scanner;

public class Calc {
    private static final String NAME = Cli.getName();
    private static final String[] OPERANDS = {"+", "-", "*"};

    public static void game() {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        int numberOfRound = 3;
        int upLimit = 100;
        int kFactor1 = 29;
        int kFactor2 = 10;
        for (int i = 0; i < numberOfRound; i++) {
            int rnd1 = (int) (Math.random() * upLimit);
            int rnd2 = (int) (Math.random() * upLimit);
            int rnd3 = (int) (Math.random() * kFactor1) / kFactor2;
            System.out.println("Question: " + rnd1 + " " + OPERANDS[rnd3] + " " + rnd2);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            int res = switch (OPERANDS[rnd3]) {
                case "+" -> sum(rnd1, rnd2);
                case "-" -> dif(rnd1, rnd2);
                case "*" -> multiple(rnd1, rnd2);
                default -> 0;
            };
            if (answer == res) {
                System.out.println("Correct!");
                j++;
            } else {
                System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d.", answer, res);
                System.out.println();
                System.out.println("Let's try again, " + NAME + "!");
                break;
            }
        }
        if (j == numberOfRound) {
            System.out.println("Congratulations, " + NAME + "!");
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int dif(int a, int b) {
        return a - b;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }
}
