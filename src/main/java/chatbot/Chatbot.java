package chatbot;

import java.util.Random;

/**
 * Denne klassen implementerer en chatbot.
 * Boten kan si enkle ting som 'Hei' og 'Hva heter du?' 
 * 
 * @author Anna Eilertsen - anna.eilertsen@uib.no
 *
 */
public class Chatbot {
	String[] RESPONSES =
		{
			"Bot: Hello, I am a bot.",
			"Bot: Hei!",
			"Bot: Hva heter du?",
			"Bot: Hva kan jeg gjøre for deg i dag?",
			"Bot: Fint vær i dag?"
		};
	
	/**
	 * The term used for the stop condition in this bot
	 */
	private CharSequence stopCondition;

	public Chatbot(String stopCondition) {
		this.stopCondition = stopCondition;
	}

	/**
	 * 
	 * @param input the string to respond to
	 * @return a response string
	 */
	public String getResponse(String input) {
		Random rand = new Random();
		int randomResponse = rand.nextInt(RESPONSES.length);
		if(input.toLowerCase().contains("hei")) {
			return RESPONSES[1];
		}
		else {
			return RESPONSES[randomResponse];
		}
	
	}
	
	/**
	 * Checks the input for stop-condition.
	 * 
	 * Stop condition is case insensitive. 
	 * 
	 * @param input an input string to check
	 * @return true if the string contains the stop condition term, false otherwise 
	 */
	boolean checkDone(String input) {
		return input.equalsIgnoreCase((String) this.stopCondition);
	}

	/**
	 * Provides a welcome message 
	 * 
	 * @return a welcome message
	 */
	public String welcome() {
		return "Hei jeg er en chatbot";
	}

}
	