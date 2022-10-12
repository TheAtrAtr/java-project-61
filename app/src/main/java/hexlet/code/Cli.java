package hexlet.code;

import java.util.Scanner;

public class Cli {
    static String name;

    public static void Hello() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
