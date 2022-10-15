package hexlet.code;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final ArrayList<String> GAMES_LIST = new ArrayList<>();
    private static final int CLI = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD_V = 4;
    private static final int PROGRESSION_V = 5;
    private static final int PRIME = 6;

    static {
        GAMES_LIST.add("Exit");
        GAMES_LIST.add("Greet");
        GAMES_LIST.add("Even");
        GAMES_LIST.add("Calc");
        GAMES_LIST.add("GCD");
        GAMES_LIST.add("Progression");
        GAMES_LIST.add("Prime");
    }

    public static void main(String[] args) {
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
        String[] parametry;
        switch (choice) {
            case CLI:
                Cli.hello();
                break;
            case EVEN:
                parametry = Even.runGame();
                Engine.run(parametry[0], parametry[1], parametry[2]);
                break;
            case CALC:
                parametry = Calc.runGame();
                Engine.run(parametry[0], parametry[1], parametry[2]);
                break;
            case GCD_V:
                parametry = GCD.runGame();
                Engine.run(parametry[0], parametry[1], parametry[2]);
                break;
            case PROGRESSION_V:
                parametry = Progression.runGame();
                Engine.run(parametry[0], parametry[1], parametry[2]);
                break;
            case PRIME:
                parametry = Prime.runGame();
                Engine.run(parametry[0], parametry[1], parametry[2]);
                break;
            case 0:
            default:
                break;
        }
    }
}
