package hexlet.code;

public class Calc {
    private static final String[] OPERANDS = {"+", "-", "*"};
    public static final int UP_LIMIT = 100;
    public static final int K_FACTOR_1 = 29;
    public static final int K_FACTOR_2 = 10;

    public static String[] runGame() {
        String voprosTelo = "What is the result of the expression?";
        StringBuilder voprosValue = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < Engine.getNumberOfRound(); i++) {
            int rnd1 = (int) (Math.random() * UP_LIMIT);
            int rnd2 = (int) (Math.random() * UP_LIMIT);
            int rnd3 = (int) (Math.random() * K_FACTOR_1) / K_FACTOR_2;
            voprosValue.append(rnd1).append(" ").append(OPERANDS[rnd3]).append(" ").append(rnd2).append("!");
            res.append(getRes(rnd1, rnd2, rnd3)).append("!");
        }
        return new String[]{voprosTelo, voprosValue.toString(), res.toString()};
    }

    private static int getRes(int rnd1, int rnd2, int rnd3) {
        int res = switch (OPERANDS[rnd3]) {
            case "+" -> sum(rnd1, rnd2);
            case "-" -> dif(rnd1, rnd2);
            case "*" -> multiple(rnd1, rnd2);
            default -> 0;
        };
        return res;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int dif(int a, int b) {
        return a - b;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }
}
