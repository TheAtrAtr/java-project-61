package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int CLI = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD_V = 4;
    private static final int PROGRESSION_V = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println();
        switch (choice) {
            case CLI:
                Cli.hello();
                break;
            case EVEN:
                Even.runGame();
                break;
            case CALC:
                Calc.runGame();
                break;
            case GCD_V:
                GCD.runGame();
                break;
            case PROGRESSION_V:
                Progression.runGame();
                break;
            case PRIME:
                Prime.runGame();
                break;
            case 0:
            default:
                break;
        }
    }
}
