// This class handles all game logic

import java.util.Random;

public class guessinggame {
    // Constants
    private static final int MAX_GUESS = 15;
    private static final int MAX_ATTEMPTS = 100;

    // Variables
    private int correctAnswer;
    private int totalGuess;

    /*
     * Initialize game
     * @param void
     * @return void
     */
    public void initializeGame() {
        Random random = new Random();
        correctAnswer = random.nextInt(MAX_GUESS) + 1;
        totalGuess = MAX_ATTEMPTS;
    }

    /*
     * Check user guess
     * @param userGuess
     * @return void
     */
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

    /*
     * Get total guess
     * @param void
     * @return totalGuess
     */
    public int getTotalGuess() {
        return totalGuess;
    }

    /*
     * Get correct answer
     * @param void
     * @return correctAnswer
     */
    public int getCorrectAnswer() {
        return correctAnswer;
    }
}