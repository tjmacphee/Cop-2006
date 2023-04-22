// This is the main class that runs the game
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        guessinggame game = new guessinggame();
        filehandler fileHandler = new filehandler();
        userinterface ui = new userinterface();

        String name = ui.getUserName();
        game.initializeGame();
        ui.displayInstructions(name);

        // Game loop
        while (true) {
            int userGuess = ui.getUserGuess();
            game.checkUserGuess(userGuess);

            // Break if user guesses correctly or runs out of guesses
            if (userGuess == game.getTotalGuess()) { 
                break;
            }
            if (userGuess == game.getCorrectAnswer()) {
                break;
            }
        }

        // Write score to file and display score
        int totalGuess = game.getTotalGuess();
        fileHandler.writeScoreToFile(name, totalGuess);
        ui.displayScore(name, totalGuess);
    }
}