package chatbot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChatBotTest{

	@Test 
	void testWelcomeNotEmpty() {
		String welcome = new Chatbot("stopp").welcome();
		assertNotNull(welcome);
		assertTrue(welcome.length() > 2);
	}

	@Test
	void testCheckDoneFails() {
		Chatbot bot = new Chatbot("foo");
		assertFalse(bot.checkDone("BAR"));
		assertFalse(bot.checkDone("stopp"));
	}
	
	@Test
	void testCheckDoneLowerCase() {
		Chatbot bot = new Chatbot("STOPP");
		assertTrue(bot.checkDone("stopp"));
	}
	
	@Test
	void testCheckDoneUpperCase() {
		Chatbot bot = new Chatbot("stopp");
		assertTrue(bot.checkDone("STOPP"));
	}
	
	@Test
	void testCheckDoneMixedCase() {
		Chatbot bot = new Chatbot("stopp");
		assertTrue(bot.checkDone("StOpP"));
	}

}
