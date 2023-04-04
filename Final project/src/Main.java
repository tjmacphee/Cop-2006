//importing utilities needed for game
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        // try block gives scan() a chance to close
        try (Scanner scan = new Scanner(System.in)) {
            //Getting user input to make the game more personalized
            System.out.println("What is your name? ");
            String name = scan.nextLine();
            name = name.toUpperCase();


            //Changing name to uppercase for simplification and explaining the game
            System.out.println("Hi " + name + ", Today we'll play a guessing game" + "\n" + "You'll have some chances to guess correctly.");
            System.out.print("\n" + "Guess what number I'm thinking of between 1 & 15: ");

            //Defining correct number through random method and total guess counter
            Random random = new Random();
            int correctAnswer = 0;
            while (true) {
                correctAnswer = random.nextInt(15);
                if (correctAnswer != 0) break;
            }
            int totalGuess = 100;

            //Making variables to accept user input and starting the loops for input validity
            int userGuess = scan.nextInt();


            /*Conditional infinite loops that inform the user of how high/low they are from being correct
            and updated guess counter by 1.
            */
            while (userGuess != correctAnswer) {
                while (userGuess <= 0 || userGuess > 15) {
                    System.out.println("That's not a valid guess, invalid guesses deduct 1 point");
                    totalGuess -= 1;
                    userGuess = scan.nextInt();
                }
                if (userGuess > correctAnswer) {
                    System.out.println("That's not right! Too high!");
                    totalGuess -= 1;
                    userGuess = scan.nextInt();
                }
                if (userGuess < correctAnswer) {
                    System.out.println("That's not right! Too low!");
                    totalGuess -= 1;
                    userGuess = scan.nextInt();
                }


            }
            // Showing total score at the end
            if (userGuess == correctAnswer) {
                System.out.println("Awesome, your score is a " + (totalGuess));
            }
            // Writing the score to the file along with their name
            try (FileWriter writeScores = new FileWriter("Scores.txt")) {
                writeScores.write(name + " " + "SCORE: " + totalGuess);
            }
        }

        // Reading & Printing the score back at the end to show final scores.
        try (Scanner getScores = new Scanner(new FileReader("Scores.txt"))) {
            System.out.println(getScores.nextLine());
        }
    }
}


