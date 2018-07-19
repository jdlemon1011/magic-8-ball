import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class EightBall {
	
	public static void main(String[] args) {
		
		// Open Scanner object and scan user's question
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the MAGIC 8 BALL.\n");
		System.out.print("Please, ask your question: ");
		// Assign user's question to a string variable - not sure if this is necessary.
		String input = in.nextLine();
		
		System.out.println("Thinking.........\n");
		
		ArrayList<String> randAnswer = new ArrayList<>();
		randAnswer.add("Yes"); randAnswer.add("No");
		randAnswer.add("Maybe..."); randAnswer.add("Never");
		randAnswer.add("Absolutely!"); randAnswer.add("It's possible...");
		randAnswer.add("Why not?"); randAnswer.add("Not my problem...");
		randAnswer.add("Certainly!"); randAnswer.add("Very doubtful");
		randAnswer.add("Signs point to 'yes'"); randAnswer.add("You're kidding right?");
		randAnswer.add("That's your question? Hahahahaha....sorry, ask again."); randAnswer.add("Don't waste my time with that...");
		randAnswer.add("Ask again later..."); randAnswer.add("Of course!");
		randAnswer.add("No doubt about it!"); randAnswer.add("You better believe it!");
		randAnswer.add("As I see it?  Yes!"); randAnswer.add("For sure!");
		
		// Generate a random answer object.
		Random answer = new Random();
		int index = answer.nextInt(randAnswer.size());
		// Assign the random answer to the index of the ArrayList
		System.out.println("'" + randAnswer.get(index) + "'");
		
		System.out.print("Would you like to ask another question? (Answer Y or N):  ");
		input = in.nextLine();
		System.out.print("\n");
		//Start loop to continue asking questions while they want to keep playing.
		while (input.equalsIgnoreCase("Y")) {
			System.out.print("Please, ask your question: ");
			input = in.nextLine();
			System.out.println("Thinking.........");
			System.out.println(" " );
			index = answer.nextInt(randAnswer.size());
			System.out.println("'" + randAnswer.get(index) + "'");
			System.out.print("Would you like to ask another question? (Y or N): ");
			input = in.nextLine();
			System.out.print("\n");
		}
		if (input.equalsIgnoreCase("N")) {
			System.out.println(" ");
			System.out.println("Thanks for playing! May your fortunes improve!");
		}
		in.close();
	}
}
