package hexlet.code;

import java.util.Scanner;

public class Calc {
    private static final String name = Cli.name;
    private static final String[] operands = {"+", "-", "*"};
    public static void Game() {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        for (int i = 0; i < 3; i++) {
            int rnd1 = (int) (Math.random() * 100);
            int rnd2 = (int) (Math.random() * 100);
            int rnd3 = (int) (Math.random() * 29)/10;
            System.out.println("Question: " + rnd1 + " " + operands[rnd3] + " " + rnd2);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            int res = switch (operands[rnd3]) {
                case "+" -> sum(rnd1, rnd2);
                case "-" -> dif(rnd1, rnd2);
                case "*" -> multiple(rnd1, rnd2);
                default -> 0;
            };
            if (answer==res){
                System.out.println("Correct!");
                j++;
            }
                 else {
                System.out.printf("'%d' is wrong answer ;(. Correct answer was '%d.", answer, res);
                System.out.println();
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (j == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
    public static int sum(int a, int b){
        return a+b;
    }

    public static int dif(int a, int b){
        return a-b;
    }

    public static int multiple(int a, int b){
        return a*b;
    }
}
