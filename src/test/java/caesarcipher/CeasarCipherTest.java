package caesarcipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeasarCipherTest {

	private static String smallAlphabet = "abcdefghijklmnopqrstuvwxyz";
	private static String largeAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String space = " ";
	
	@Test
	void testShiftCharacterAcceptSmallLetters() {
		smallAlphabet.chars().forEach(c -> CeasarCipher.shiftCharacter((char)c, 0));
	}
	
	@Test
	void testShiftCharacterAcceptLargeLetters() {
		largeAlphabet.chars().forEach(c -> CeasarCipher.shiftCharacter((char)c, 0));
	}
	
	@Test
	void testShiftCharacterAcceptSpace() {
		CeasarCipher.shiftCharacter(space.charAt(0), 0);
	}
	
	@Test
	void testShiftCharacterReflexive() {
		smallAlphabet.chars().forEach(c -> assertEquals((char)c, CeasarCipher.shiftCharacter((char)c, 0)));
		largeAlphabet.chars().forEach(c -> assertEquals((char)c, CeasarCipher.shiftCharacter((char)c, 0)));
		assertEquals(space.charAt(0), CeasarCipher.shiftCharacter(space.charAt(0), 0));
	}

	@Test
	void testShiftCharacter() {
		assertEquals('f', CeasarCipher.shiftCharacter('a', 5));
		assertEquals('a', CeasarCipher.shiftCharacter('z', 1));
		assertEquals('z', CeasarCipher.shiftCharacter('a', -1));
		assertEquals('d', CeasarCipher.shiftCharacter('a', -49));
	}
	
	@Test
	void testShiftCharacterEqualsEncrypt() {
		assertEquals(CeasarCipher.shiftCharacter('a', 5), CeasarCipher.encrypt("a", 5).charAt(0));
		assertEquals(CeasarCipher.shiftCharacter('z', 1), CeasarCipher.encrypt("z", 1).charAt(0));
		assertEquals(CeasarCipher.shiftCharacter('a', -1), CeasarCipher.encrypt("a", -1).charAt(0));
		assertEquals(CeasarCipher.shiftCharacter('a', -49), CeasarCipher.encrypt("a", -49).charAt(0));
	}

	
	@Test
	void testEncryptReflexive() {
		assertEquals(smallAlphabet, CeasarCipher.encrypt(smallAlphabet, 0));
		assertEquals(largeAlphabet, CeasarCipher.encrypt(largeAlphabet, 0));
		assertEquals(space, CeasarCipher.encrypt(space, 0));
	}
	
	@Test
	void testDecryptReflexive() {
		assertEquals(smallAlphabet, CeasarCipher.decrypt(smallAlphabet, 0));
		assertEquals(largeAlphabet, CeasarCipher.decrypt(largeAlphabet, 0));
		assertEquals(space, CeasarCipher.decrypt(space, 0));
	}
	
	@Test
	void testInverseProperty() {
		assertEquals("foo", CeasarCipher.decrypt(CeasarCipher.encrypt("foo", 4), 4));
		assertEquals("bar", CeasarCipher.encrypt(CeasarCipher.decrypt("bar", -10), -10));
	}
}
