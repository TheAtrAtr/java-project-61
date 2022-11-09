package hexlet.code.games;

import hexlet.code.Engine;

import java.util.LinkedHashMap;
import java.util.Map;

public class Calc {
    private static final String QUESTION_BODY = "What is the result of the expression?";
    private static final char[] OPERANDS = {'+', '-', '*'};
    public static final int UP_LIMIT = 100;
    public static final int UP_LIMIT_FOR_SELECT_RANDOM_OPERANDS = 3;

    public static void runGame() {
        Map<String, String> questionAnsver = new LinkedHashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ROUND; i++) {
            int rnd1 = (int) (Math.random() * UP_LIMIT);
            int rnd2 = (int) (Math.random() * UP_LIMIT);
            int rnd3 = (int) (Math.random() * UP_LIMIT_FOR_SELECT_RANDOM_OPERANDS);
            char operation = OPERANDS[rnd3];
            String question = rnd1 + " " + OPERANDS[rnd3] + (" ") + (rnd2) + ("!");
            String ansver = String.valueOf(calculate(rnd1, rnd2, operation));
            questionAnsver.put(question, ansver);
        }
        Engine.run(QUESTION_BODY, questionAnsver);
    }

    private static int calculate(int rnd1, int rnd2, char operation) {
        return switch (operation) {
            case '+' -> rnd1 + rnd2;
            case '-' -> rnd1 - rnd2;
            case '*' -> rnd1 * rnd2;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }
}
