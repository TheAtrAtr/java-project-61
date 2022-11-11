package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class GCD {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static final int UP_LIMIT = 100;

    public static void runGame() {
        Map<String, String> roundsData = new LinkedHashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ROUND; i++) {
            generateRoundData(roundsData);
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    private static void generateRoundData(Map<String, String> roundsData) {
        int number1 = (int) (Utils.getRandom() * UP_LIMIT);
        int number2 = (int) (Utils.getRandom() * UP_LIMIT);
        String question = number1 + " " + number2;
        String answer = String.valueOf(calculateGCD(number1, number2));
        roundsData.put(question, answer);
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
