import java.util.Scanner;

public class userinterface {
    private Scanner scanner = new Scanner(System.in);

    public String getUserName() {
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        return name.toUpperCase();
    }

    public void displayInstructions(String name) {
        System.out.println("Hi " + name + ", Today we'll play a guessing game" + "\n" + "You'll have some chances to guess correctly.");
        System.out.print("\n" + "Guess what number I'm thinking of between 1 & 15: ");
    }

    public int getUserGuess() {
        int userGuess = scanner.nextInt();
        while (userGuess <= 0 || userGuess > 15) {
            System.out.println("That's not a valid guess, invalid guesses deduct 1 point");
            userGuess = scanner.nextInt();
        }
        return userGuess;
    }

    public void displayScore(String name, int totalGuess) {
        System.out.println("Awesome, " + name + ", your score is " + totalGuess);
    }
}
