import java.io.FileWriter;
import java.io.IOException;

public class filehandler {
    private static final String FILENAME = "Scores.txt";

    public void writeScoreToFile(String name, int totalGuess) throws IOException {
        try (FileWriter writeScores = new FileWriter(FILENAME)) {
            writeScores.write(name + " " + "SCORE: " + totalGuess);
        }
    }
}