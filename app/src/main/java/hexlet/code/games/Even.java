package hexlet.code.games;

import hexlet.code.Engine;

import java.util.LinkedHashMap;
import java.util.Map;

public class Even {
    private static final String QUESTION_BODY = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int UP_LIMIT = 100;

    public static void runGame() {
        Map<String, String> questionAnsver = new LinkedHashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ROUND; i++) {
            int rnd = (int) (Math.random() * UP_LIMIT);
            String question = String.valueOf(rnd);
            String ansver = isEven(rnd) ? "yes" : "no";
            questionAnsver.put(question, ansver);
        }
        Engine.run(QUESTION_BODY, questionAnsver);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
