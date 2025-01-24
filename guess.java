import java.util.*;

public class guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(1, 101); 
        int attempts = 0;
        
        System.out.println("Guess the number (between 1 and 100):");

        while (true) {
            int guess = sc.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Error! Number out of range.");
                continue;
            }

            if (guess == target) {
                System.out.println("You have guessed correctly!");
                System.out.println("Number of attempts: " + attempts);
                break;
            }

            System.out.println(guess > target ? "Guess a smaller number." : "Guess a larger number.");
        }
        sc.close();

    }
}
