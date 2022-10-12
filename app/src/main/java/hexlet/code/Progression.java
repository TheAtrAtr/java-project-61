package hexlet.code;

import java.util.Scanner;

public class Progression {
    private static final String name = Cli.name;
    public static void Game() {
        System.out.println("What number is missing in the progression?");
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        for (int z = 0; z < 3; z++) {
            int arraySize = 11 - (int) (Math.random() * 5);
            int dotPozition = (int) (Math.random() * arraySize);
            int[] array = new int[arraySize];
            int stepOfProgression = 11 - (int) (Math.random() * 5);
            array[0] = 11 - (int) (Math.random() * 5);
            for (int i = 1; i < arraySize; i++) {
                array[i] = array[i - 1] + stepOfProgression;
            }
            System.out.print("Question: ");
            for (int k = 0; k < arraySize; k++) {
                if (k == dotPozition)
                    System.out.print(".. ");
                else
                    System.out.print(array[k] + " ");
            }

            System.out.println();
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer == array[dotPozition]) {
                System.out.println("Correct!");
                j++;
            }
            else {
                System.out.print("Question: ");
                for (int k = 0; k < arraySize; k++) {
                    if (k == dotPozition)
                        System.out.print(".. ");
                    else
                        System.out.print(array[k] + " ");
                }
                System.out.println();
                System.out.print("Your answer: " + answer);
                System.out.println();
                System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d.", answer, array[dotPozition]);
                System.out.println();
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (j == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
