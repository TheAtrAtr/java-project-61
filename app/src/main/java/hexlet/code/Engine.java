package hexlet.code;

import java.util.ArrayList;
import java.util.Scanner;

public class Engine {
    private static final ArrayList<String> GAMES_LIST = new ArrayList<>();

    static {
        GAMES_LIST.add("Exit");
        GAMES_LIST.add("Greet");
        GAMES_LIST.add("Even");
        GAMES_LIST.add("Calc");
        GAMES_LIST.add("GCD");
        GAMES_LIST.add("Progression");
        GAMES_LIST.add("Prime");
    }
    
    public static void showMenu() {
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 1; i < GAMES_LIST.size(); i++) {
            System.out.printf("%d - %s", i, GAMES_LIST.get(i));
            System.out.println();
        }
        System.out.printf("%d - %s", 0, GAMES_LIST.get(0));
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
