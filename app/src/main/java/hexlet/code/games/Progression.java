package hexlet.code.games;

import hexlet.code.Engine;

import java.util.LinkedHashMap;
import java.util.Map;

public class Progression {
    private static final String QUESTION_BODY = "What number is missing in the progression?";
    public static final int DOWN_LIMIT_RANDOM_NUMBER = 5;
    public static final int UP_LIMIT_RANDOM_NUMBER = 12;

    public static void runGame() {
        Map<String, String> questionAnsver = new LinkedHashMap<>();
        for (int z = 0; z < Engine.NUMBER_OF_ROUND; z++) {
            StringBuilder question = new StringBuilder();
            int arraySize = getRandomNumber();
            int dotPozition = (int) (Math.random() * arraySize);
            int stepOfProgression = getRandomNumber();
            int firstElement = getRandomNumber();
            int[] array = getProgressionArray(firstElement, stepOfProgression, arraySize);
            for (int k = 0; k < arraySize; k++) {
                if (k == dotPozition) {
                    question.append(".. ");
                } else {
                    question.append(array[k]).append(" ");
                }
            }
            String ansver = String.valueOf(array[dotPozition]);
            questionAnsver.put(question.toString(), ansver);
        }
        Engine.run(QUESTION_BODY, questionAnsver);
    }

    private static int getRandomNumber() {
        return (int) (Math.random() * UP_LIMIT_RANDOM_NUMBER) + DOWN_LIMIT_RANDOM_NUMBER;
    }

    private static int[] getProgressionArray(int firstElement, int stepOfProgression, int progressionSize) {
        int[] array = new int[progressionSize];
        array[0] = firstElement;
        for (int i = 1; i < progressionSize; i++) {
            array[i] = array[i - 1] + stepOfProgression;
        }
        return array;
    }
}
