import java.util.Random;
import java.util.Scanner;
public class NumberGameTask1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int secretNumber = ran.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;

            System.out.printf("\nRound %d\n", ++rounds);
            System.out.printf("Guess the number between %d and %d: ", lowerBound, upperBound);

            while (attempts < maxAttempts) {
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == secretNumber) {
                    System.out.printf("Congratulations! You guessed the number in %d attempts.\n", attempts);
                    totalAttempts += attempts;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                System.out.printf("Attempts left: %d\n", maxAttempts - attempts);
            }

            if (attempts == maxAttempts) {
                System.out.printf("Sorry! You've reached the maximum attempts. The correct number was %d.\n", secretNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.printf("Game over. You played %d rounds. Your total score is %d.\n", rounds, totalAttempts);
        scanner.close();
    }
}
