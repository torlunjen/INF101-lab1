package chatbot;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Chatbot chatbot = new Chatbot("stopp");
		Scanner sc = new Scanner(System.in);
		System.out.println(chatbot.welcome());

		boolean done = false;
		while(!done) {
			String input = getInput(sc);
			if(chatbot.checkDone(input)) {
				done = true;
			}
			else {
				System.out.println(chatbot.getResponse(input));
			}
		}
		sc.close();
	}

	private static String getInput(Scanner sc) {
		System.out.print("User: ");
		return sc.nextLine();
	}	
}
