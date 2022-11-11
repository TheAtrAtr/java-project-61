package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int UP_LIMIT = 100;

    public static void runGame() {
        Map<String, String> roundsData = new LinkedHashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ROUND; i++) {
            generateRoundData(roundsData);
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    private static void generateRoundData(Map<String, String> roundsData) {
        int number = Utils.getRandom(UP_LIMIT);
        String question = String.valueOf(number);
        String answer = isEven(number) ? "yes" : "no";
        roundsData.put(question, answer);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
