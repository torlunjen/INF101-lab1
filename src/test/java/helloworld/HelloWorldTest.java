package helloworld;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.Runtime.Version;

import org.junit.jupiter.api.Test;

import helloworld.HelloWorld;

class HelloWorldTest{

	@Test 
	void testGetHelloWorld() {
		assertTrue(HelloWorld.getHelloWorld().equals("Hello World!"));
	}

	@Test
	void testJavaVersion() {
		String minimalJavaVersion = "13";
		String currentJavaVersion = System.getProperty("java.version");
		Version current = Runtime.Version.parse(currentJavaVersion);
		Version minimal = Runtime.Version.parse(minimalJavaVersion);
		assertTrue(current.compareTo(minimal) >= 0, "Your Java version is too low, it should be at least 13. Current version is: " + currentJavaVersion);
	}

}
