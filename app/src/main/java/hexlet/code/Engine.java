package hexlet.code;

import java.util.ArrayList;
import java.util.Scanner;

public class Engine {
    private static final ArrayList<String> gamesList = new ArrayList<>();

    static {
        gamesList.add("Exit");
        gamesList.add("Greet");
        gamesList.add("Even");
        gamesList.add("Calc");
        gamesList.add("GCD");
        gamesList.add("Progression");
        gamesList.add("Prime");
    }

    public static void showMenu() {
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 1; i < gamesList.size(); i++) {
            System.out.printf("%d - %s", i, gamesList.get(i));
            System.out.println();
        }
        System.out.printf("%d - %s", 0, gamesList.get(0));
        System.out.println();
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                Cli.hello();
                break;
            case 2:
                Cli.hello();
                Even.game();
                break;
            case 3:
                Cli.hello();
                Calc.game();
                break;
            case 4:
                Cli.hello();
                GCD.game();
                break;
            case 5:
                Cli.hello();
                Progression.game();
                break;
            case 6:
                Cli.hello();
                Prime.game();
                break;
            case 0:
            default:
                break;
        }

    }
}
