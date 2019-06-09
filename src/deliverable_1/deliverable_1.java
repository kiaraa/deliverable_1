package deliverable_1;

import java.util.Scanner;

public class deliverable_1 {

	public static void main(String[] args) {
		
		String eventType = "";
		int partySize = -1;
		String result;
		Scanner scanner = new Scanner(System.in);
		String meal = "";
		String howToPrep = "";
		boolean validPartySize = false;
		boolean validEventType = false;
		
		while (validEventType == false) {
			System.out.println("Is your event casual, semi-formal, or formal?");
			eventType = scanner.next();
		
			if (eventType.compareTo("casual") == 0) {
				meal = "sandwiches";
				validEventType = true;
			}
			else if (eventType.compareTo("semi-formal") == 0) {
				meal = "fried chicken";
				validEventType = true;
			}
			else if (eventType.compareTo("formal") == 0) {
				meal = "chicken parmesan";
				validEventType = true;
			}
			else {
				System.out.println("Invalid input. Please enter either casual, semi-formal, or formal.");
			}
		}
		
		while (validPartySize == false) {
			System.out.println("How many attendees are you expecting?");
			partySize = scanner.nextInt();
		
			if (partySize == 1) {
				howToPrep = "in your microwave.";
				validPartySize = true;
			}
			else if (partySize > 1 && partySize < 13) {
				howToPrep = "in your kitchen.";
				validPartySize = true;
			}
			else if (partySize > 12) {
				howToPrep = "by a caterer.";
				validPartySize = true;
			}
			else {
				System.out.println("Invalid input. Please enter an integer larger than 1.");
			}
		}
		
		System.out.println("Since you're hosting a " + eventType + " event for " + partySize + " participants, you should serve " + meal + " prepared " + howToPrep);
		
	}

}

