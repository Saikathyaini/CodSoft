import java.util.Random;
import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;
        int rounds = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            rounds++;
            int number = random.nextInt(100) + 1; 
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + rounds + ":");
            System.out.println("I have generated a number between 1 and 100. You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < number) {
                    System.out.println("Too low! Try again.");
                } else if (guess > number) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    totalScore++;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + number + ".");
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgainInput = scanner.next().trim().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("\nGame over! You played " + rounds + " rounds and won " + totalScore + " rounds.");
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
