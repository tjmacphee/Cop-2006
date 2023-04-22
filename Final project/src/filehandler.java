// This is the filehandler class, which handles all file operations
import java.io.FileWriter;
import java.io.IOException;

public class filehandler {
    // Constants
    private static final String FILENAME = "Scores.txt";

    /*
     * Write score to file
     * @param name, totalGuess
     * @return void
     */
    public void writeScoreToFile(String name, int totalGuess) throws IOException {
        try (FileWriter writeScores = new FileWriter(FILENAME)) {
            writeScores.write(name + " " + "SCORE: " + totalGuess);
        }
    }
}