package hexlet.code;

import java.math.BigInteger;

public class Prime {
    public static final int UP_LIMIT = 1000;

    public static String[] runGame() {
        String voprosTelo = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        StringBuilder voprosValue = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < Engine.getNumberOfRound(); i++) {
            int rnd = (int) (Math.random() * UP_LIMIT);
            voprosValue.append(rnd).append("!");
            String x = isPrime(rnd) ? "yes" : "no";
            res.append(x).append("!");
        }
        return new String[]{voprosTelo, voprosValue.toString(), res.toString()};
    }

    static boolean isPrime(int x) {
        BigInteger bigInteger = BigInteger.valueOf(x);
        return bigInteger.isProbablePrime((int) Math.log(x));
    }
}
