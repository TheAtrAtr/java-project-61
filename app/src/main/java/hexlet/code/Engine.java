package hexlet.code;

import java.util.Map;
import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUND = 3;

    public static void run(String questionBody, Map<String, String> questionAnsver) {
        int j = 0;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(questionBody);
        for (var question : questionAnsver.keySet()) {
            System.out.print("Question: " + question);
            System.out.println();
            String answer = scanner.next();
            if (!answer.equals(questionAnsver.get(question))) {
                System.out.printf("'%s' is wrong answer ;(. "
                        + "Correct answer was '%s'.", answer, questionAnsver.get(question));
                System.out.println();
                System.out.println("Let's try again, " + name + "!");
                break;
            } else {
                System.out.println("Correct!");
                j++;
                if (j == questionAnsver.size()) {
                    System.out.println("Congratulations, " + name + "!");
                }
            }
        }
    }
}
