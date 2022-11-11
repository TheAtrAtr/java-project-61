package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPERANDS = {'+', '-', '*'};
    public static final int UP_LIMIT = 100;

    public static void runGame() {
        Map<String, String> roundsData = new LinkedHashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ROUND; i++) {
            generateRoundData(roundsData);
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    private static void generateRoundData(Map<String, String> roundsData) {
        int number1 = Utils.getRandom(UP_LIMIT);
        int number2 = Utils.getRandom(UP_LIMIT);
        int operandIndex = Utils.getRandom(OPERANDS.length);
        char operation = OPERANDS[operandIndex];
        String question = number1 + " " + operation + (" ") + (number2) + ("!");
        String answer = String.valueOf(calculate(number1, number2, operation));
        roundsData.put(question, answer);
    }

    private static int calculate(int number1, int number2, char operation) {
        return switch (operation) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }
}
