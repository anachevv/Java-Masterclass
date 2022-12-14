public class Main {
    public static void main(String[] args) {
        int score = 10000;
        int lvlCompleted = 8;
        int bonus = 200;
        int finalScore = score + (lvlCompleted * bonus);

        int minScoreRequired = 20000;

        boolean gameOver = finalScore < minScoreRequired;

        if (gameOver) {
            System.out.println("Final score is less than the minimum score required.");
        } else {
            System.out.printf("Final score: %d%n", finalScore);
        }

    }
}
