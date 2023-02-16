package net.luis.l2;

import net.luis.util.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis-st
 *
 */

class TextProcessingTest {
	
	@Test
	@Task("2.1.4 - 1.1")
	void calculateTextLength() {
		String text = "Hello World!";
		int expected = 12;
		int actual = TextProcessing.calculateTextLength(text);
		assertEquals(expected, actual);
	}
	
	@Test
	@Task("2.1.4 - 1.2")
	void convertInLowercase() {
		String text = "Hello World!";
		String expected = "hello world!";
		String actual = TextProcessing.convertInLowercase(text);
		assertEquals(expected, actual);
	}
}