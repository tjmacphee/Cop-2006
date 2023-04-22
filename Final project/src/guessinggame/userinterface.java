package guessinggame;
// This class handles all user interaction
import java.util.Scanner;

public class userinterface {
    private Scanner scanner = new Scanner(System.in);

    /*
     * Get user name
     * @param void
     * @return name
     */
    public String getUserName() {
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        return name.toUpperCase();
    }

    /*
     * Display instructions to user
     * @param name
     * @return void
     */
    public void displayInstructions(String name) {
        System.out.println("Hi " + name + ", Today we'll play a guessing game" + "\n" + "You'll have some chances to guess correctly.");
        System.out.print("\n" + "Guess what number I'm thinking of between 1 & 15: ");
    }

    /*
     * Get user guess
     * @param void
     * @return userGuess
     */
    public int getUserGuess() {
        while (!scanner.hasNextInt()) { // Check if input is an integer
            System.out.println("That's not a valid guess, please enter a number.");
            scanner.next(); // discard the invalid input
        }
        int userGuess = scanner.nextInt();
        while (userGuess <= 0 || userGuess > 15) { // Check if input is between 1 & 15
            System.out.println("That's not a valid guess, invalid guesses deduct 1 point");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a number.");
                scanner.next(); // discard the invalid input
            }
            userGuess = scanner.nextInt();
        }
        return userGuess;
    }

    /*
     * Display score to user
     * @param name, totalGuess
     * @return void
     */
    public void displayScore(String name, int totalGuess) {
        System.out.println("Awesome, " + name + ", your score is " + totalGuess);
    }
}
