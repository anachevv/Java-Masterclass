public class Main {

    public static void main(String[] args) {
        int playerPosition1 = calculateHighScorePosition(1500);
        int playerPosition2 = calculateHighScorePosition(1000);
        int playerPosition3 = calculateHighScorePosition(500);
        int playerPosition4 = calculateHighScorePosition(100);
        int playerPosition5 = calculateHighScorePosition(25);

        displayHighScorePosition("Jack", playerPosition1);
        displayHighScorePosition("Nabil", playerPosition2);
        displayHighScorePosition("Juan", playerPosition3);
        displayHighScorePosition("Sucre", playerPosition4);
        displayHighScorePosition("Michael", playerPosition5);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        String message = String.format("%s managed to get into position %d on the high score list", playerName, playerPosition);
        System.out.println(message);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}