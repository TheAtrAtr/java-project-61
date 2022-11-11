package hexlet.code;

import java.util.Map;
import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUND = 3;

    public static void run(String description, Map<String, String> roundsData) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(description);

        for (var questionAnswer : roundsData.entrySet()) {
            String question = questionAnswer.getKey();
            String answer = questionAnswer.getValue();
            System.out.print("Question: " + question);
            System.out.println();
            String userAnswer = scanner.next();
            if (!userAnswer.equals(answer)) {
                System.out.printf("'%s' is wrong userAnswer ;(. "
                        + "Correct userAnswer was '%s'.", userAnswer, answer);
                System.out.println();
                System.out.println("Let's try again, " + name + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
