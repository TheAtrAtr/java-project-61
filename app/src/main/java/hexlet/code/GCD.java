package hexlet.code;

public class GCD {
    public static final int UP_LIMIT = 100;

    public static String[] runGame() {
        String voprosTelo = "Find the greatest common divisor of given numbers.";
        StringBuilder voprosValue = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < Engine.getNumberOfRound(); i++) {
            int rnd1 = (int) (Math.random() * UP_LIMIT);
            int rnd2 = (int) (Math.random() * UP_LIMIT);
            voprosValue.append(rnd1).append(" ").append(rnd2).append("!");
            res.append(calculateGCD(rnd1, rnd2)).append("!");
        }
        return new String[]{voprosTelo, voprosValue.toString(), res.toString()};
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
