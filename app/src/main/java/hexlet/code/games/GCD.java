package hexlet.code.games;

import hexlet.code.Engine;

import java.util.LinkedHashMap;
import java.util.Map;

public class GCD {
    private static final String QUESTION_BODY = "Find the greatest common divisor of given numbers.";
    public static final int UP_LIMIT = 100;

    public static void runGame() {
        Map<String, String> questionAnsver = new LinkedHashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ROUND; i++) {
            int rnd1 = (int) (Math.random() * UP_LIMIT);
            int rnd2 = (int) (Math.random() * UP_LIMIT);
            String question = rnd1 + " " + rnd2;
            String ansver = String.valueOf(calculateGCD(rnd1, rnd2));
            questionAnsver.put(question, ansver);
        }
        Engine.run(QUESTION_BODY, questionAnsver);
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
