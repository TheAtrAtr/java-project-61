package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    public static final int DOWN_LIMIT_RANDOM_NUMBER = 5;
    public static final int UP_LIMIT_RANDOM_NUMBER = 12;

    public static void runGame() {
        Map<String, String> roundsData = new LinkedHashMap<>();
        for (int z = 0; z < Engine.NUMBER_OF_ROUND; z++) {
            generateRoundData(roundsData);
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    private static void generateRoundData(Map<String, String> roundsData) {
        StringBuilder question = new StringBuilder();
        int arraySize = getRandomNumber();
        int dotPozition = Utils.getRandom(arraySize);
        int stepOfProgression = getRandomNumber();
        int firstElement = getRandomNumber();
        int[] array = generateProgression(firstElement, stepOfProgression, arraySize);
        for (int k = 0; k < arraySize; k++) {
            if (k == dotPozition) {
                question.append(".. ");
            } else {
                question.append(array[k]).append(" ");
            }
        }
        String answer = String.valueOf(array[dotPozition]);
        roundsData.put(question.toString(), answer);
    }

    private static int getRandomNumber() {
        return Utils.getRandom(UP_LIMIT_RANDOM_NUMBER) + DOWN_LIMIT_RANDOM_NUMBER;
    }

    private static int[] generateProgression(int firstElement, int stepOfProgression, int progressionSize) {
        int[] array = new int[progressionSize];
        array[0] = firstElement;
        for (int i = 1; i < progressionSize; i++) {
            array[i] = array[i - 1] + stepOfProgression;
        }
        return array;
    }
}
