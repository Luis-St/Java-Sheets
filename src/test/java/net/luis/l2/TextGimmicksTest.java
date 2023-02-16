package net.luis.l2;

import net.luis.util.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis-st
 *
 */

class TextGimmicksTest {
	
	@Test
	@Task("2.2.3 - 1.1")
	void convertInUppercase() {
		String text = "Hello World!";
		String expected = "HELLO WORLD!";
		String actual = TextGimmicks.convertInUppercase(text);
		assertEquals(expected, actual);
	}
	
	@Test
	@Task("2.2.3 - 1.2")
	void determineSubtext() {
		String text = "Hello World!";
		int cut = 5;
		String expected = "Hello";
		String actual = TextGimmicks.determineSubtext(text, cut);
		assertEquals(expected, actual);
	}
}