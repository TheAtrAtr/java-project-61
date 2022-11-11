package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int UP_LIMIT = 1000;

    public static void runGame() {
        Map<String, String> roundsData = new LinkedHashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ROUND; i++) {
            generateRoundData(roundsData);
        }
        Engine.run(DESCRIPTION, roundsData);
    }

    private static void generateRoundData(Map<String, String> roundsData) {
        int number = Utils.getRandom(UP_LIMIT);
        String question = String.valueOf(number);
        String answer = isPrime(number) ? "yes" : "no";
        roundsData.put(question, answer);
    }

    static boolean isPrime(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        return bigInteger.isProbablePrime((int) Math.log(number));
    }
}
