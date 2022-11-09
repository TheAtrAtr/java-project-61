package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

public class Prime {
    private static final String QUESTION_BODY = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int UP_LIMIT = 1000;

    public static void runGame() {
        Map<String, String> questionAnsver = new LinkedHashMap<>();
        for (int i = 0; i < Engine.NUMBER_OF_ROUND; i++) {
            int rnd = (int) (Math.random() * UP_LIMIT);
            String question = String.valueOf(rnd);
            String answer = isPrime(rnd) ? "yes" : "no";
            questionAnsver.put(question, answer);
        }
        Engine.run(QUESTION_BODY, questionAnsver);
    }

    static boolean isPrime(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        return bigInteger.isProbablePrime((int) Math.log(number));
    }
}
