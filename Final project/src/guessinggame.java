import java.util.Random;

public class guessinggame {
    private static final int MAX_GUESS = 15;
    private static final int MAX_ATTEMPTS = 100;

    private int correctAnswer;
    private int totalGuess;

    public void initializeGame() {
        Random random = new Random();
        correctAnswer = random.nextInt(MAX_GUESS) + 1;
        totalGuess = MAX_ATTEMPTS;
    }

    public int checkUserGuess(int userGuess) {
        totalGuess--;
        if (userGuess > correctAnswer) {
            System.out.println("That's not right! Too high!");
            return 0;
        } else if (userGuess < correctAnswer) {
            System.out.println("That's not right! Too low!");
            return 0;
        } else {
            System.out.println("That's right! You got it!");
            return 1;
        }
    }

    public int getTotalGuess() {
        return totalGuess;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}