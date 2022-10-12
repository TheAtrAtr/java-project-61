package hexlet.code;

import java.util.ArrayList;
import java.util.Scanner;

public class Engine {
    static ArrayList<String> gamesList = new ArrayList<>();

    static {
        gamesList.add("Exit");
        gamesList.add("Greet");
        gamesList.add("Even");
        gamesList.add("Calc");
        gamesList.add("GCD");
    }

    public static void ShowMenu(){
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
                Cli.Hello();
                break;
            case 2:
                Cli.Hello();
                Even.Game();
                break;
            case 3:
                Cli.Hello();
                Calc.Game();
                break;
            case 4:
                Cli.Hello();
                GCD.Game();
                break;
            case 0:
                break;
        }

    }
}
