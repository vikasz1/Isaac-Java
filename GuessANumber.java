import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Create a Random object to generate a random number
        Random rand = new Random();
        // Generate a random number between 1 and 200 (inclusive)
        int randomNumber = rand.nextInt(200) + 1;

        // Initialize variables for tracking the number of guesses and whether the user has won
        int numGuesses = 0;
        boolean won = false;

        // Enter a loop to prompt the user for guesses until they guess correctly
        while (!won) {
            // Prompt the user for a guess
            System.out.print("Guess a number between 1 and 200: ");
            int guess = input.nextInt();
            numGuesses++;

            // Check if the guess is correct
            if (guess == randomNumber) {
                won = true;
                // Print the message corresponding to the number of guesses
                if (numGuesses == 1) {
                    System.out.println("Wow, you got it on the first try!");
                } else if (numGuesses >= 2 && numGuesses <= 3) {
                    System.out.println("You're pretty lucky!");
                } else if (numGuesses >= 4 && numGuesses <= 7) {
                    System.out.println("Not bad, not bad..");
                } else if (numGuesses == 8) {
                    System.out.println("That was not very impressive.");
                } else if (numGuesses >= 9 && numGuesses <= 10) {
                    System.out.println("Are you having any fun at all?");
                } else {
                    System.out.println("Maybe you should play something else.");
                }
            } else if (guess < randomNumber) {
                // If the guess is too low, prompt the user to guess again
                System.out.println("Your guess was too low.");
            } else {
                // If the guess is too high, prompt the user to guess again
                System.out.println("Your guess was too high.");
            }
        }

        // Print the number of guesses it took to win
        System.out.println("It took you " + numGuesses + " guesses to get the right answer.");
    }
}
