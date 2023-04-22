import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        guessinggame game = new guessinggame();
        filehandler fileHandler = new filehandler();
        userinterface ui = new userinterface();

        String name = ui.getUserName();
        game.initializeGame();
        ui.displayInstructions(name);

        while (true) {
            int userGuess = ui.getUserGuess();
            game.checkUserGuess(userGuess);
            if (userGuess == game.getTotalGuess()) { 
                break;
            }

            if (userGuess == game.getCorrectAnswer()) {
                break;
            }
        }

        int totalGuess = game.getTotalGuess();
        fileHandler.writeScoreToFile(name, totalGuess);
        ui.displayScore(name, totalGuess);
    }
}