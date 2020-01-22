package caesarcipher;

import java.util.Scanner;

/**
 * 
 * A class to encrypt text using Caesar cipher, also known as shift cipher
 * 
 * Caesar cipher is a type of substitution cipher 
 * in which each letter in the plaintext is replaced 
 * by a letter some fixed number of positions down the alphabet.
 * 
 * For example the plaintext 
 * "in which each letter in the plaintext is replaced", 
 * shifted 5 letters down the alphabet, becomes  
 * "ns bmnhm jfhm qjyyjw ns ymj uqfnsyjcy nx wjuqfhji"
 * 
 * 
 * @author Martin Vatshelle, Anna Eilertsen
 *
 */
public class CeasarCipher {
	static int num_chars = 26;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dette programmet kan kryptere og dekryptere strenger ved hjelp av CaesarCipher.");
		System.out.println("Skriv \"encrypt\" dersom du vil kryptere en streng og \"decrypt\" dersom du vil de-kryptere en streng.");
		String xCrypt = scanner.nextLine();
		//TODO sjekk om bruker skrev encrypt eller decrypt
		
		//TODO les inn streng og steg fra terminalen
		
		//TODO skriv ut kryptert eller dekryptert streng
		
		scanner.close();
	}

	/**
	 * Shifts a letter through the alphabet
	 * Capital letter is shifted to Capital letter 
	 * and lower case is shifted to lower case. 
	 * @param c - an character in the English alphabet, 
	 * either capital or lower case letter
	 * 
	 * @param steps - number of steps to shift characters
	 * @return 
	 * 
	 */
	public static char shiftCharacter(char c, int steps){
		if(steps == 0) {
			return c;
		}
		return (char)(nextIndex(c, steps));
	}
	
	/**
	 * @param index - index in the alphabet (0-25)
	 * @param steps - number of steps to right-shift (positive or negative)
	 * @return an index in the alphabet (0-25) such that it is {@link steps} away from the original {@link index} 
	 */
	private static int nextIndex(int index, int steps) {
		int ascii = 'a';
		int nextStep = ((index - ascii) + steps) % 26;

		if(nextStep < 0) {
			int finalStep = nextStep + 26;
			return finalStep + ascii;
		}
		return nextStep + ascii;
	}
	
	/**
	 * @param s - The text to encode
	 * @param steps - Number of steps to shift the letters
	 * @return - the coded text
	 */
	public static String encrypt(String s, int steps) {
		StringBuilder ns = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char nc = shiftCharacter(s.charAt(i), steps);
			ns.append(nc);
		}
		return ns.toString();
	}
	
	/**
	 * @param s - the coded message
	 * @param steps - the number of steps that was used to code
	 * @return - the decoded message
	 */
	public static String decrypt(String s, int steps){
		return encrypt(s, - steps);

	}

}
