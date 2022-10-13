package hexlet.code;

import java.util.Scanner;

public class Progression {
    private static final String NAME = Cli.getName();

    public static void game() {
        System.out.println("What number is missing in the progression?");
        int numberOfRound = 3;
        int j = 0;
        int kFactor1 = 5;
        int kFactor2 = 11;
        Scanner scanner = new Scanner(System.in);
        for (int z = 0; z < numberOfRound; z++) {
            int arraySize = kFactor2 - (int) (Math.random() * kFactor1);
            int dotPozition = (int) (Math.random() * arraySize);
            int[] array = new int[arraySize];
            int stepOfProgression = kFactor2 - (int) (Math.random() * kFactor1);
            array[0] = kFactor2 - (int) (Math.random() * kFactor1);
            for (int i = 1; i < arraySize; i++) {
                array[i] = array[i - 1] + stepOfProgression;
            }
            System.out.print("Question: ");
            for (int k = 0; k < arraySize; k++) {
                if (k == dotPozition) {
                    System.out.print(".. ");
                } else {
                    System.out.print(array[k] + " ");
                }
            }

            System.out.println();
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer == array[dotPozition]) {
                System.out.println("Correct!");
                j++;
            } else {
                System.out.print("Question: ");
                for (int k = 0; k < arraySize; k++) {
                    if (k == dotPozition) {
                        System.out.print(".. ");
                    } else {
                        System.out.print(array[k] + " ");
                    }
                }
                System.out.println();
                System.out.print("Your answer: " + answer);
                System.out.println();
                System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d.", answer, array[dotPozition]);
                System.out.println();
                System.out.println("Let's try again, " + NAME + "!");
                break;
            }
        }
        if (j == numberOfRound) {
            System.out.println("Congratulations, " + NAME + "!");
        }
    }
}
