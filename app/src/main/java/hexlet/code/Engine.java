package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int NUMBER_OF_ROUND = 3;

    public static void run(String voprosTelo, String voprosValue, String result) {
        int j = 0;
        String[] voprosValueArray = voprosValue.split("!");
        String[] resultArray = result.split("!");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(voprosTelo);
        for (int i = 0; i < NUMBER_OF_ROUND; i++) {
            System.out.print("Question: " + voprosValueArray[i]);
            System.out.println();
            String answer = scanner.next();
            if (!answer.equals(resultArray[i])) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.", answer, resultArray[i]);
                System.out.println();
                System.out.println("Let's try again, " + name + "!");
                break;
            } else {
                System.out.println("Correct!");
                j++;
            }
        }
        if (j == NUMBER_OF_ROUND) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    public static int getNumberOfRound() {
        return NUMBER_OF_ROUND;
    }
}
