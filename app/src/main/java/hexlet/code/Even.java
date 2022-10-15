package hexlet.code;

public class Even {
    public static final int UP_LIMIT = 100;

    public static String[] runGame() {
        String voprosTelo = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        StringBuilder voprosValue = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < Engine.getNumberOfRound(); i++) {
            int rnd = (int) (Math.random() * UP_LIMIT);
            voprosValue.append(rnd).append("!");
            res.append(isEven(rnd) ? "yes" : "no").append("!");
        }
        return new String[]{voprosTelo, voprosValue.toString(), res.toString()};
    }

    private static boolean isEven(int rnd) {
        return rnd % 2 == 0;
    }
}
