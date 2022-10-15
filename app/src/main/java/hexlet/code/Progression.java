package hexlet.code;

public class Progression {
    public static final int K_FACTOR_1 = 5;
    public static final int K_FACTOR_2 = 11;

    public static String[] runGame() {
        String voprosTelo = "What number is missing in the progression?";
        StringBuilder voprosValue = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int z = 0; z < Engine.getNumberOfRound(); z++) {
            int arraySize = K_FACTOR_2 - (int) (Math.random() * K_FACTOR_1);
            int dotPozition = (int) (Math.random() * arraySize);
            int stepOfProgression = K_FACTOR_2 - (int) (Math.random() * K_FACTOR_1);
            int firstElement = K_FACTOR_2 - (int) (Math.random() * K_FACTOR_1);
            int[] array = getProgressionArray(firstElement, stepOfProgression, arraySize);
            for (int k = 0; k < arraySize; k++) {
                if (k == dotPozition) {
                    voprosValue.append(".. ");
                } else {
                    voprosValue.append(array[k]).append(" ");
                }
            }
            voprosValue.append("!");
            res.append(array[dotPozition]).append("!");
        }
        return new String[]{voprosTelo, voprosValue.toString(), res.toString()};
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
