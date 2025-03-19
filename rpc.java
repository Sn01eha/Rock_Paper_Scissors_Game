package rockpaperscissor;
import java.util.Scanner;

public class rpc {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String[] options = {"Rock", "Paper", "Scissors"};
	        
	        int userScore = 0;
	        int computerScore = 0;
	        int rounds = 5;
	        
	        System.out.println("Welcome to the Rock-Paper-Scissors Championship!");
	        
	        for (int round = 1; round <= rounds; round++) {
	            System.out.println("\nRound " + round);
	            System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
	            String userChoice = scanner.nextLine();

	            int computerChoiceIndex = (int) (Math.random() * 3);
	            String computerChoice = options[computerChoiceIndex];
	            
	            System.out.println("Computer chose: " + computerChoice);

	            if (userChoice.equalsIgnoreCase(computerChoice)) {
	                System.out.println("It's a tie!");
	            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
	                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
	                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
	                System.out.println("You win this round!");
	                userScore++;
	            } else {
	                System.out.println("Computer wins this round!");
	                computerScore++;
	            }

	            System.out.println("Scores: You - " + userScore + ", Computer - " + computerScore);
	        }

	        System.out.println("\nFinal Scores: You - " + userScore + ", Computer - " + computerScore);
	        
	        if (userScore > computerScore) {
	            System.out.println("Congratulations! You are the ultimate winner!");
	        } else if (userScore < computerScore) {
	            System.out.println("The computer is the ultimate winner! Better luck next time.");
	        } else {
	            System.out.println("It's a tie overall! Well played.");
	        }
	        
	        scanner.close();
	}

}
